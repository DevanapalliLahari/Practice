package com.xworkz.sort;

import java.util.Arrays;

public class QuickSort {
	static int partition(int[] arr, int start, int end) {

		int pivot = arr[(start + end) / 2];

		while (start < end) {

			while (arr[start] < pivot) {
				start++;
			}

			while (pivot < arr[end]) {
				end--;
			}

			if (start <= end) {
				int temp = arr[start];
				arr[start]= arr[end];
				arr[end] = temp;

				start++;
				end--;
			}
		}
		return start;
	}

	static void quicksort(int[] arr, int start, int end) {
		int pivotIndex = partition(arr, start, end);

		if (start < pivotIndex - 1) {
			quicksort(arr, start, pivotIndex - 1);
		}

		if (pivotIndex < end) {
			quicksort(arr, pivotIndex, end);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 27, 23, 11, 7, 9, 17, 6 };

		System.out.println("Unsorted array:");
		
			System.out.println(Arrays.toString(arr));
		

		QuickSort.quicksort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		
			System.out.println(Arrays.toString(arr));
		
	}}