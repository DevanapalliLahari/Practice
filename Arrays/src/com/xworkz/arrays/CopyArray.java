package com.xworkz.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []array=new int[] {20,65,39,81,65,23,76,87};
int []arr=Arrays.copyOf(array, array.length);
System.out.println(" The Copied Array: "+Arrays.toString(arr));
	}

}
