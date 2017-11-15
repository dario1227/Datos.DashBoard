package org.tec.datastructures.arboles;

public class ArbolAVL {
	private NodoAVL root;
	 
    public int Height(NodoAVL N) {
        if (N == null)
            return 0;
 
        return N.height;
    }
 
    public int Max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    public NodoAVL rightRotate(NodoAVL y) {
        NodoAVL x = y.left;
        NodoAVL T2 = x.right;
 
        x.right = y;
        y.left = T2;
        
        y.height = Max(Height(y.left), Height(y.right)) + 1;
        x.height = Max(Height(x.left), Height(x.right)) + 1;
 
        return x;
    }
 
    public NodoAVL leftRotate(NodoAVL x) {
        NodoAVL y = x.right;
        NodoAVL T2 = y.left;
 
        y.left = x;
        x.right = T2;
 
        x.height = Max(Height(x.left), Height(x.right)) + 1;
        y.height = Max(Height(y.left), Height(y.right)) + 1;
 
        return y;
    }
 
    public int getBalance(NodoAVL N) {
        if (N == null) {
            return 0;
        }else {
        return Height(N.left) - Height(N.right);
        }
    }
 
  public NodoAVL insertar(int element, NodoAVL current) {
	  if(current == null) {
			return new NodoAVL(element);
		}
		if(element < current.element) {
			current.left= this.insertar(element, current.left);
		}else if(element > current.element) {
			current.right = this.insertar(element, current.right);
		}else {
			return current;
		}
        
        current.height = 1 + Max(Height(current.left), Height(current.right));
 
        int balance = getBalance(current);
 
        if (balance > 1 && element < current.left.element)  {
            return rightRotate(current);
        }
        
        if (balance < -1 && element > current.right.element) {
            return leftRotate(current);
        }
 
        if (balance > 1 && element > current.left.element) {
            current.left = leftRotate(current.left);
            return rightRotate(current);
        }
 
        if (balance < -1 && element < current.right.element) {
            current.right = rightRotate(current.right);
            return leftRotate(current);
        }
 
        return current;
    }
 
    public void preOrder(NodoAVL node) {
        if(node != null) {
            System.out.print(node.element + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
       
        
    }
    public void ImprimirAltura(NodoAVL node) {
    	if(node != null) {
            System.out.print(node.height + " "+ " ");
            ImprimirAltura(node.left);
            ImprimirAltura(node.right);
        }
       
    }
    //Prueba
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
 
        arbol.root = arbol.insertar(47, arbol.root);
        arbol.root = arbol.insertar(14, arbol.root);
        arbol.root = arbol.insertar(95, arbol.root);
        arbol.root = arbol.insertar(43, arbol.root);
        arbol.root = arbol.insertar(98, arbol.root);
        arbol.root = arbol.insertar(5, arbol.root);
 
        arbol.preOrder(arbol.root);
        System.out.println("");
        arbol.ImprimirAltura(arbol.root);
    }
}