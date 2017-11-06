package test;

import org.tec.algo.search.BusquedaInterpolacion;
import org.tec.algo.sort.BubbleSort;
import org.tec.algo.sort.MergeSort;
import org.tec.algo.sort.QuickSort;

public class Test {

	public static void main(String[] args) {
		int[]arr= {1,5,3,8,5,2,6};
		BusquedaInterpolacion.start(arr,3);
		print(arr);
	}
	public static void print(int[]arr) {
		for(int x:arr) {
			System.out.print(x+",");
		}
	}

}
