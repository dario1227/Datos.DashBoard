package org.tec.algo.sort;

public class InsertionSort {
	public static void Acomodo(int[] arr)
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
 
	 public void ImprimirArray(int[] arr)
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
}

