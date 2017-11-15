package org.tec.datastructures.pila;

public class Stack {
	private Nodo1 ultimo;
	private Nodo1 primero;
	public Stack() {
		this.ultimo = null;
		this.primero = null;
	}
	

	public Nodo1 getUltimo() {
		return ultimo;
	}


	public void setUltimo(Nodo1 ultimo) {
		this.ultimo = ultimo;
	}


	public void Push(int element) {
		if(this.primero == null) {
			this.primero = new Nodo1(element);
			this.ultimo = this.primero;
			this.primero.setAnterior(null);
		}else {
			Nodo1 A = this.ultimo;
			A.setSiguiente(new Nodo1(element));
			A.getSiguiente().setAnterior(A);
			this.ultimo = A.getSiguiente();
		}
		}
	

	public void Pop() {
		Nodo1 u = this.ultimo.getAnterior();
		this.ultimo = null;
		this.ultimo = u;
		
	}

	public Object Peek() {
		return this.getUltimo().getValor();
	}
	//Prueba
	public static void main(String[] args) {
		Stack u = new Stack();
		u.Push(4);
		u.Push(3);
		u.Push(8);
		u.Push(1);
		u.Pop();
		u.Pop();
		System.out.println(u.Peek());
	}
}
