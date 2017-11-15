package org.tec.datastructures.pila;

public class Stack<T> {
	private Nodo1<T> ultimo;
	private Nodo1<T> primero;
	public Stack() {
		this.ultimo = null;
		this.primero = null;
	}
	

	public Nodo1<T> getUltimo() {
		return ultimo;
	}


	public void setUltimo(Nodo1<T> ultimo) {
		this.ultimo = ultimo;
	}


	public void Push(T element) {
		if(this.primero == null) {
			this.primero = new Nodo1<>(element);
			this.ultimo = this.primero;
			this.primero.setAnterior(null);
		}else {
			Nodo1<T> A = this.ultimo;
			A.setSiguiente(new Nodo1<>(element));
			A.getSiguiente().setAnterior(A);
			this.ultimo = A.getSiguiente();
		}
		}
	

	public void Pop() {
		Nodo1<T> u = this.ultimo.getAnterior();
		this.ultimo = null;
		this.ultimo = u;
		
	}

	public Object Peek() {
		return this.getUltimo().getValor();
	}

}
