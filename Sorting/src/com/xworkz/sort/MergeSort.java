package com.xworkz.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]=new int[] {2,9,7,4,5,1,0,8};
		System.out.println("The original array:");
		System.out.println(Arrays.toString(arr));
		MergeSort mergeSort=new MergeSort();//Creating Object
		mergeSort.sort(arr, 0, arr.length-1);//Accessing the Method by the reference of the object
		System.out.println("The Sorted Array:");
		System.out.println(Arrays.toString(arr));
	}

	public void merge(int arr[], int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;

		int[] rightArray = new int[n2];
		int[] leftArray = new int[n1];
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[middle + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			sort(arr, left, middle);//Accessing the non-static method
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

}