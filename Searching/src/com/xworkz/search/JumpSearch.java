package com.xworkz.search;

public class JumpSearch {
	// Applying Jump search function
	public static int jumpSearch(int[] arr, int target) {
		int length = arr.length;
		int step = (int) Math.floor(Math.sqrt(length));

		int prev = 0;
		while (arr[Math.min(step, length) - 1] < target) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(length));
			if (prev >= length) {
				return -1;
			}
		}

		// Linear search for target in block beginning with prev
		while (arr[prev] < target) {
			prev++;
			if (prev == Math.min(step, length)) {
				return -1;
			}
		}
		if (arr[prev] == target) {
			return prev;
		}

		return -1; 
	}
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 7, 9, 11, 15, 19, 23, 27, 30 };
		int target = 15;
		int result = jumpSearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found in array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
