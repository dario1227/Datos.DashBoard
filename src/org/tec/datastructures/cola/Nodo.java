package org.tec.datastructures.cola;

public class Nodo<T> {
	T valor;
	Nodo<T>next;
	public Nodo() {
		this.valor=null;
		this.next=null;
	}
	public void setvalor(T valor) {
		this.valor=valor;
	}

}
