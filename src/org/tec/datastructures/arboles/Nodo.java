package org.tec.datastructures.arboles;

public class Nodo<T> {
	T element;
	Nodo<T> right;
	Nodo<T> left;
	public Nodo(T element) {
		this.element = element;
		this.left = null;
		this.right = null;
	}
	
	public Nodo(T element, Nodo<T> right, Nodo<T> left) {
		this.element = element;
		this.right = right;
		this.left = left;
	}

}
