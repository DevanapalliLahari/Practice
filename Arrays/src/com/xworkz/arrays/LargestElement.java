package com.xworkz.arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 20, 50, 46, 72, 84, 93, 92, 57, 45 };
		int length = arr.length;
		int i = 0;
		int j = i + 1;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++)

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}

		System.out.println("the oder elements are :");

		for (i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("The Second Largest Element is:" + arr[1]);
		System.out.println("The Kth Largest element is:" + arr[0]);//By using Sorted order
		System.out.println("The Kth Smallest element is:" + arr[8]);
	}

}
