package org.tec.datastructures.arboles;

public class ArbolAVL<T> {
	private NodoAVL<T> root=null;
	
    public int Height(NodoAVL<T> left) {
        if (left == null)
            return 0;
 
        return left.height;
    }
 
    public int Max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    public NodoAVL<T> rightRotate(NodoAVL<T> y) {
        NodoAVL<T> x = y.left;
        NodoAVL<T> T2 = x.right;
 
        x.right = y;
        y.left = T2;
        
        y.height = Max(Height(y.left), Height(y.right)) + 1;
        x.height = Max(Height(x.left), Height(x.right)) + 1;
 
        return x;
    }
 
    @SuppressWarnings("unchecked")
	public NodoAVL<Integer> leftRotate(NodoAVL<Integer> left) {
        NodoAVL<Integer> y = left.right;
        NodoAVL<Integer> T2 = y.left;
 
        y.left = left;
        left.right = T2;
 
        left.height = Max(Height((NodoAVL<T>) left.left), Height((NodoAVL<T>) left.right)) + 1;
        y.height = Max(Height((NodoAVL<T>) y.left), Height((NodoAVL<T>) y.right)) + 1;
 
        return y;
    }
 
    public int getBalance(NodoAVL<T> N) {
        if (N == null) {
            return 0;
        }else {
        return Height(N.left) - Height(N.right);
        }
    }
 
  @SuppressWarnings("unchecked")
public NodoAVL<Integer> insertar(Integer element, NodoAVL<Integer> current) {
	  if(current == null) {
			return new NodoAVL<Integer>(element);
		}
		if(element < current.element) {
			current.left= this.insertar(element, current.left);
		}else if(element > current.element) {
			current.right = this.insertar(element, current.right);
		}else {
			return current;
		}
        
        current.height = 1 + Max(Height((NodoAVL<T>) current.left), Height((NodoAVL<T>) current.right));
 
        int balance = getBalance((NodoAVL<T>) current);
 
        if (balance > 1 && element < current.left.element)  {
            return (NodoAVL<Integer>) rightRotate((NodoAVL<T>) current);
        }
        
        if (balance < -1 && element > current.right.element) {
            return leftRotate(current);
        }
 
        if (balance > 1 && element > current.left.element) {
            current.left = leftRotate(current.left);
            return (NodoAVL<Integer>) rightRotate((NodoAVL<T>) current);
        }
 
        if (balance < -1 && element < current.right.element) {
            current.right = (NodoAVL<Integer>) rightRotate((NodoAVL<T>) current.right);
            return leftRotate(current);
        }
 
        return current;
    }
 
    public void preOrder(NodoAVL<T> node) {
        if(node != null) {
            System.out.print(node.element + " ");
            preOrder(node.left);
            preOrder(node.right);
       } 
       
    }
}