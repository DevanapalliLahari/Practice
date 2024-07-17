package com.xworkz.sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 20, 78, 54, 894, 908, 45 };
		System.out.println("The original array:" + Arrays.toString(arr));
		RadixSort.sort(arr);
		System.out.println("The Sorted Array:" + Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		RadixSort.radixSort(arr, 10);
	}

	public static void radixSort(int[] arr, int radix) {
		if (arr.length == 0) {
			return;
		}
		int minimumValue = arr[0];
		int maximumValue = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < minimumValue) {
				minimumValue = arr[i];
			} else if (arr[i] > maximumValue) {
				maximumValue = arr[i];
			}

		int exponent = 1;
		while ((maximumValue - minimumValue) / exponent >= 1) {
			RadixSort.countingSortByDigit(arr, radix, exponent, minimumValue);
			exponent *= radix;

		}
	}

	public static void countingSortByDigit(int[] arr, int radix, int exponent, int minimumValue) {
		int bucketIndex;
		int[] buckets = new int[radix];
		int[] output = new int[arr.length];
		for (int i = 0; i < radix; i++) {
			buckets[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			bucketIndex = (int) (((arr[i] - minimumValue) / exponent) % radix);
			buckets[bucketIndex]++;
		}
		for (int i = 1; i < radix; i++) {
			buckets[i] += buckets[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			bucketIndex = (int) (((arr[i] - minimumValue) / exponent) % radix);
			output[--buckets[bucketIndex]] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}
}
