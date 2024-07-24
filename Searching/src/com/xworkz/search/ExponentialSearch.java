package com.xworkz.search;

public class ExponentialSearch {
	// Applying binary search for sub array
	private static int binarySearch(int[] arr, int left, int right, int target) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return -1;
	}

	// Applying Exponential search function
	public static int exponentialSearch(int[] arr, int n, int target) //n=length
	{
		if (arr[0] == target)
		{
			return 0;
		}
		int i = 1;//i=index
		while (i < n && arr[i] <= target)
		{
			i = i * 2;
		}
		return binarySearch(arr, i / 2, Math.min(i, n - 1), target);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40, 50, 60, 70, 80, 90 };
		int n = arr.length;
		int target = 10;
		int result = exponentialSearch(arr, n, target);

		if (result == -1)
			System.out.println("Element not found in array");
		else
			System.out.println("Element found at index " + result);
	}
}
