package org.tec.datastructures.arboles;

public class ArbolBinario {
	private Nodo root;
	
	public ArbolBinario() {
		this.root = null;
	}
	
	public boolean contiene(int element) {
		return this.contiene(element, root);
	}
	
	private boolean contiene(int element, Nodo current) {
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
	
	@SuppressWarnings("null")
	public int findmin() {
		if(this.root == null) {
			return (Integer) null;
		}else {
			return findMin(this.root);
		}
	
	}
	@SuppressWarnings("null")
	private int findMin(Nodo current1) {
		if(current1 == null) {
			return (Integer) null;
		}else if(current1.left == null) {
			return current1.element;
		}else {
			return findMin(current1.left);
			}
	}
	
	public void insertar(int element) {
		this.root = this.insertar(element, this.root);
	}
	private Nodo insertar(int element, Nodo current) {
		if(current == null) {
			return new Nodo(element);
		}
		if(element < current.element) {
			current.left= this.insertar(element, current.left);
		}else if(element > current.element) {
			current.right = this.insertar(element, current.right);
		}
		return current;
		}
	
	public Nodo eliminar(int element) {
		if(this.root == null) {
			return null;
		}else {
			return eliminar(element, this.root);
		}
	}
	
	private Nodo eliminar(int element, Nodo u) {
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
