package org.tec.datastructures.arboles;

public class ArbolAVL {
	private Nodo root;
	private int nivel;
	private int altura;
	public ArbolAVL() {
		this.root = null;
		this.nivel = 0;
		this.altura = (nivel + 1);
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
}
