package com.xworkz.search;

public class Interpolation {
	public static void main(String[] args) {
	    int[] array = new int[] { 2, 3, 6, 8, 10, 13, 16, 18 };
	    int K = 13;

	    int res = interpolationSearch(array, K);

	    if (res >= 0) {
	        System.out.println(K + " found at index: " + res);
	    } else {
	        System.out.println(K + " not found");
	    }
	}

	private static int interpolationSearch(int[] array, int K) {
	    int n = array.length;
	    int low = 0;
	    int high = n - 1;

	    while (low <= high && K >= array[low] && K <= array[high]) {

	        int index = low + ((K - array[low]) * (high - low)) / (array[high] - array[low]);

	        if (array[index] < K) {
	            low = index + 1;
	        } else if (array[index] > K) {
	            high = index - 1;
	        } else {
	            // found K
	            return index;
	        }
	    }

	    return -1;
	}

}
