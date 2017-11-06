package org.tec.algo.search;

import java.util.ArrayList;

import org.tec.algo.sort.QuickSort;

public class BusquedaInterpolacion<E> {
	static int buscado;
	static int[] array;
	public static <E> void start(int[] arr,int busca) {
		if(arr.length==0) {
			System.out.println("Array Vacio");
		}
		else {
			QuickSort.start(arr);
			array=arr;
			buscado=busca;
			aux();
		}
	}
	public static void aux() {
	    int lo = 0 ;
	    int hi = (array.length - 1);
        while (lo <= hi && buscado >= array[lo] && buscado <= array[hi])
        {
            int pos = lo + (((hi-lo) /(array[hi]-array[lo]))*(buscado - array[lo]));
               if (array[pos] == buscado) {
            	   System.out.println("ENCONTRADO");
               }
            if (array[pos] < buscado) {
                lo = pos + 1;
            }
            else {
                hi = pos - 1;
            }
        }
	}
	
}
