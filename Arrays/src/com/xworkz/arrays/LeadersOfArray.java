package com.xworkz.arrays;

public class LeadersOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 76, 33, 78, 19, 92, 40, 20 };
		int length = arr.length;
		int j;
		for (int i = 0; i < length; i++) {
			int k = arr[i];
			for (j = i + 1; j < length; j++) {
				if (arr[j] >= k) {
					break;
				}
			}
			if (j == length) {
				System.out.println("The leaders are array is:" + k + "");
			}
		}

	}

}
