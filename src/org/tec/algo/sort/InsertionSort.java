package org.tec.algo.sort;

public class InsertionSort {
	public void Acomodo(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int referencia = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > referencia)
            {
                arr[j+1] = arr[j];
                j= j-1;
            }

            arr[j+1] = referencia;
        }
    }
 
	 public void ImprimirArray(int arr[])
	    {
	        int n = arr.length;
	        System.out.print("[");
	        for (int i=0; i<(n-1); ++i)
	        {
	     	System.out.print(arr[i] +",");
	        }
	     System.out.print(arr[n-1]);
	        System.out.print("]");
	 	System.out.println();
	        
	        }
 
    // Prueba
    public static void main(String args[])
    {        
        int arr[] = {12, 1, 143, 53, 6};
 
        InsertionSort w = new InsertionSort();        
        System.out.println("Antes");
        w.ImprimirArray(arr);
        w.Acomodo(arr);
        System.out.println("Después de ordenarla"); 
        w.ImprimirArray(arr);
    }
}
