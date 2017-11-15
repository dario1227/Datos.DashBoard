package org.tec.datastructures.arboles;

public class ArbolBinario<T> {
private Nodo<T> root;
	
	public ArbolBinario() {
		this.root = null;
	}
	
	@SuppressWarnings("unchecked")
	public boolean contiene(int element) {
		return this.contiene(element, (Nodo<Integer>) root);
	}
	
	private boolean contiene(int element, Nodo<Integer> current) {
		if(current == null) {
			return false;
		}else{
			if(element < current.element) {
				return contiene(element, current.left);
			}else if(element > current.element) {
				return contiene(element, current.right);
			}else {
				return true;
			}
			
		}
		}
	
	@SuppressWarnings({ "null", "unchecked" })
	public int findmin() {
		if(this.root == null) {
			return (Integer) null;
		}else {
			return findMin((Nodo<Integer>) this.root);
		}
	
	}
	@SuppressWarnings("null")
	private int findMin(Nodo<Integer> current1) {
		if(current1 == null) {
			return (Integer) null;
		}else if(current1.left == null) {
			return (int) current1.element;
		}else {
			return findMin(current1.left);
			}
	}
	
	@SuppressWarnings("unchecked")
	public void insertar(int element) {
		this.root = (Nodo<T>) this.insertar(element, (Nodo<Integer>) this.root);
	}
	private Nodo<Integer> insertar(int element, Nodo<Integer> current) {
		if(current == null) {
			return new Nodo<>(element);
		}
		if(element < current.element) {
			current.left= this.insertar(element, current.left);
		}else if(element > current.element) {
			current.right = this.insertar(element, current.right);
		}
		return current;
		}
	
	@SuppressWarnings("unchecked")
	public Nodo<Integer> eliminar(int element) {
		if(this.root == null) {
			return null;
		}else {
			return eliminar(element, (Nodo<Integer>)this.root);
		}
	}
	
	private Nodo<Integer> eliminar(int element, Nodo<Integer> u) {
		if(u == null) {
			return u; 
		}
		if(element < u.element) {
			u.left = eliminar(element, u.left);
		}else if(element > u.element) {
			u.right = eliminar(element, u.right);
		}else if(u.left != null && u.right != null) {
			u.element = findMin(u.right);
			u.right = eliminar(u.element, u.right);
		}else {
			u = u.left != null ? u.left : u.right;
		}
		return u;
	}
	
	}
