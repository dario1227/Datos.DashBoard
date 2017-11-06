package org.tec.datastructures.arboles;

public class Nodo {
	int element;
	Nodo right;
	Nodo left;
	public Nodo(int element) {
		this.element = element;
		this.left = null;
		this.right = null;
	}
	public Nodo(int element, Nodo right, Nodo left) {
		this.element = element;
		this.right = right;
		this.left = left;
	}

}
