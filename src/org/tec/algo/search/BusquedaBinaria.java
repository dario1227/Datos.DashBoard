package org.tec.algo.search;

public class BusquedaBinaria {
	public int Busqueda(int arr[], int minIndice, int maxIndice, int buscado)
    {
        if (maxIndice >= minIndice)
        {
            int mid = (minIndice + maxIndice)/2;
 
            if (arr[mid] == buscado) {
               return mid;
        	} else if (arr[mid] > buscado) {
               return Busqueda(arr, minIndice, mid-1, buscado);
            } else {
            	return Busqueda(arr, mid+1, maxIndice, buscado);
            }
        }
        return -1;
 
    }
 
    // Prueba
    public static void main(String args[])
    {
        BusquedaBinaria v = new BusquedaBinaria();
        int arr[] = {8,18,21,357,843};
        int n = arr.length;
        int x = 8;
        int resultado = v.Busqueda(arr,0,n-1,x);
        if (resultado == -1)
            System.out.println("Elemento no encontrado");
        else
            System.out.println("El elemento se encuentra en la posición "+resultado);
    }
}
