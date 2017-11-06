package org.tec.algo.sort;

public class MergeSort {
	static int[] helper;
	static int[] numbers;
	public static void start(int[] arr) {
	        helper=new int[arr.length];
	        numbers=arr;
	        mergesort(0,arr.length-1);
	    }

	    private static void mergesort(int low, int high) {
	        if (low < high) {
	            int middle = low + (high - low) / 2;
	            mergesort(low, middle);
	            mergesort(middle + 1, high);
	            merge(low, middle, high);
	        }
	        
	    }

	    private static void merge(int low, int middle, int high) {
	        for (int i = low; i <= high; i++) {
	            helper[i] = numbers[i];
	        }
	        int i = low;
	        int j = middle + 1;
	        int k = low;
	        while (i <= middle && j <= high) {
	            if (helper[i] <= helper[j]) {
	                numbers[k] = helper[i];
	                i++;
	            } else {
	                numbers[k] = helper[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            numbers[k] = helper[i];
	            k++;
	            i++;
	        }

	    }

}
