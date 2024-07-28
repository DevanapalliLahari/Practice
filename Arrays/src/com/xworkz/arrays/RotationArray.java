package com.xworkz.arrays;

import java.util.Arrays;

public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 4,8,2,9,5,7 };

		int n = 9;
		System.out.print("The original array");
		for (int i = 0; i < arr.length; i++) {
			
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			int j, first;
			first = arr[0];

			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
			}
		System.out.println();
		System.out.print("The left rotation arrray");
	
		for (int i = 0; i < arr.length; i++) {
		
		}
		System.out.println(Arrays.toString(arr));
	}

}
