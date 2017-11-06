package org.tec.algo.sort;

public class QuickSort {
	public static void start(int[]arr) {
		quickSort(0,arr.length-1,arr);
	}
    private static void quickSort(int lowerIndex, int higherIndex,int[] arr) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
    
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j,arr);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j,arr);
        if (i < higherIndex)
            quickSort(i, higherIndex,arr);
    }
 
    private static void exchangeNumbers(int i, int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
}
