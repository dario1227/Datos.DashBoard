package org.tec.datastructures.pila;

public class Stack {
	private int max_size;
	private Object[] StackArray;
	private int top;

	public Stack(int max) {
		max_size = max;
		StackArray = new Object[max_size];
		top = -1;
	}

	public void Push(Object newObject) {
		if(top < (max_size -1)) {
			this.StackArray[++ top]= newObject;
		}else {
			System.out.println("La pila está llena");
		}
	}

	public Object Pop() {
		return this.StackArray[top --];
	}

	public Object Peek() {
		return this.StackArray[top];
	}
	// Prueba
	public static void main(String[] args) {
		Stack u = new Stack(3);
		u.Push(4);
		u.Push(3);
		u.Pop();
		u.Push(1);
		u.Push(7);
		u.Push(6);
		System.out.println(u.Peek());
	}
}
