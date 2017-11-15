package org.tec.datastructures.pila;

public class Nodo1 {
	private int valor;
	private Nodo1 siguiente;
	private Nodo1 anterior;
	public Nodo1(int valor) {
		this.valor = valor;
		this.siguiente = null;
		this.anterior = null;
	}
	
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo1 getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo1 siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo1 getAnterior() {
		return anterior;
	}


	public void setAnterior(Nodo1 anterior) {
		this.anterior = anterior;
	}
	
}
