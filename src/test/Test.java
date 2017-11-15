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
		System.out.println("\n"+suma(123457));
	}
	public static void print(int[]arr) {
		for(int x:arr) {
			System.out.print(x+",");
		}
	}
	public static int suma(int x) {
		return sumaAux(x,0) ;

	}
	private static int sumaAux(int x, int result) {
		if(x!=0) {
			int y=x%10;
			if(y%2==1) {
				result+=y;
				return sumaAux(x/10,result);
			}
			else {
				return sumaAux(x/10,result);
			}
		}
		return result;
	}
	
}
