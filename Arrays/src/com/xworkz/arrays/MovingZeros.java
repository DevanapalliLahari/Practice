package com.xworkz.arrays;

public class MovingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 0, 4, 3, 9, 7, 0, 2, 1, 0, 3, 0, 4, 2 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {

				arr[count++] = arr[i];

			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}

		System.out.println("The array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i ]);
		}
	}
}
