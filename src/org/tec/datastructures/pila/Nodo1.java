package org.tec.datastructures.pila;

public class Nodo1<T> {
	private T valor;
	private Nodo1<T> siguiente;
	private Nodo1<T> anterior;
	public Nodo1(T valor) {
		this.valor = valor;
		this.siguiente = null;
		this.anterior = null;
	}
	
	

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo1<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo1<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo1<T> getAnterior() {
		return anterior;
	}


	public void setAnterior(Nodo1<T> anterior) {
		this.anterior = anterior;
	}
	
}
