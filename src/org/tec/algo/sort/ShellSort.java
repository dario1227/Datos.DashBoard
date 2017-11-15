package org.tec.algo.sort;

public class ShellSort {
	 public static int Acomodo(int[] arr)
	    {
	        int n = arr.length;
	        for (int salto = n/2; salto > 0; salto /= 2)
	        {
	            for (int i = salto; i < n; i += 1)
	            {
	                
	                int temp = arr[i];
	                int j;
	                for (j = i; j >= salto && arr[j - salto] > temp; j -= salto) {
	                    arr[j] = arr[j - salto];
	                }
	                arr[j] = temp;
	            }
	        }
	        return 0;
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
}
