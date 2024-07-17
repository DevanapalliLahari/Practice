package com.xworkz.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 4, 9, 7, 3, 2, 8 };
		System.out.println("The Original Array:" + Arrays.toString(arr));
		insertion(arr);
		System.out.println("The Sorted Array:" + Arrays.toString(arr));
	}

	static void insertion(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
