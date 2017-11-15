package org.tec.datastructures.arboles;

public class NodoAVL<T> { 
	T element; 
	int height;
    NodoAVL<T> left;
    NodoAVL<T> right;
 
    public NodoAVL(T d) {
        element = d;
        height = 1;
    }
	

}

