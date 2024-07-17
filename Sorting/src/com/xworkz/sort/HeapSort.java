package com.xworkz.sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 60, 92, 64, 39, 40, 29, 70, 57, 83, 90 };
	
		System.out.println("The Original array:" + Arrays.toString(arr));
		HeapSort.heapSort(arr);
		System.out.println("The Sorted Array:" + Arrays.toString(arr));

	}

	public static void shiftDown(int arr[], int start, int end) {
		int root = start;
		while (root * 2 + 1 <= end) {
			int child = root * 2 + 1;
			if (child + 1 <= end && arr[child] <= arr[child + 1])

				child = child + 1;
			if (arr[root] < arr[child]) {
				int temp = arr[root];
				arr[root] = arr[child];
				arr[child] = temp;
				root = child;
			}
			else {
				return;
			}
		}
	}

	public static void heapify(int arr[], int length) {
		int start = (length - 2) / 2;
		while (start >= 0) {
			shiftDown(arr, start, length - 1);
			start--;
		}
	}

	public static void heapSort(int[] arr) {
		int length = arr.length;
		int end = length - 1;
		heapify(arr, end);
		while (end > 0) {

			int temp = arr[end];
			arr[end] = arr[0];
			arr[0] = temp;

			shiftDown(arr, 0, end - 1);
			end--;
		}
	}
}
