package org.tec.datastructures.cola;

public class Queue<T> {
    private Nodo<T> first;   
    private Nodo<T> last;    
    private int n; 
    
    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }
    public T peek() {
        return first.valor;
    }
    public void enqueue(T item) {
        Nodo<T> oldlast = last;
        last = new Nodo<T>();
        last.valor = item;
        last.next = null;        
        oldlast.next = last;
        n++;
    }
    public T dequeue() {
        T item = first.valor;
        first = first.next;
        n--;
        return item;
    }
}
