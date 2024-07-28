package com.xworkz.arrays;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 10, 2, 7, 3, 23, 16, 29 };
		int length=array.length;
		System.out.println("The length of the array is:"+length);
		for(int i=0;i<length;i++)
		{
			System.out.println("The looping elements are:"+array[i]);
		}
	}

}
