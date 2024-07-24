package com.xworkz.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 80, 20, 14, 72, 84, 75, 38, 93, 60, 21, 30, 40 };
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		int target = 72;
		int indexOfTargetElement = recursive(arr, start, end, target);
		if(indexOfTargetElement==-1) {
			System.out.println("The index is not found");
		}
		else
		{
			System.out.println("element is found at index:"+indexOfTargetElement);
		}
	}
		

	public static int recursive(int[] arr, int start, int end, int target) {
		//while (end>=start) {
		if(end>=start) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				return recursive(arr, mid + 1, end, target);
				//start=mid+1;
			}
			if (arr[mid] > target) {
				return recursive(arr, start, mid - 1, target);
				//end=mid;
			}
		}
		return -1;
	}
}
