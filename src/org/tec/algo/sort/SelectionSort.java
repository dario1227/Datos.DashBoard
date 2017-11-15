package org.tec.algo.sort;

public class SelectionSort {
	public static void Acomodo(int[] arr)
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min])
                    min = j;
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        SelectionSort u = new SelectionSort();
        int arr[] = {47,15,2,85,55};
        System.out.println("Arreglo inicial");
        u.ImprimirArray(arr);
        u.Acomodo(arr);
        System.out.println("Lista ordenada ascendentemente");
        u.ImprimirArray(arr);
    }
}
