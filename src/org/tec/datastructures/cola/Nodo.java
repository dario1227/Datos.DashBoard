package org.tec.datastructures.cola;

public class Nodo<T> {
	T valor;
	Nodo<T>next;
	public Nodo(T valor) {
		this.valor=valor;
		this.next=null;
	}

}
