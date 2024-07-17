package com.xworkz.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 90, 40, 60, 38, 64, 20 };
		System.out.println("The Original Array:" + Arrays.toString(arr));
		selection(arr);
		System.out.println("The Sorted Array:" + Arrays.toString(arr));
	}

	static void selection(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
				}
			}
			int temp = arr[minimumIndex];
			arr[minimumIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
