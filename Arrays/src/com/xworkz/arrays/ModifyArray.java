package com.xworkz.arrays;

import java.util.Arrays;

public class ModifyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int array[]=new int[] {72,10,32,56,48,39,20,47};
  System.out.println("The modified array is:"+Arrays.toString(array));
  int a=array[7]=19;
  int b=array[5]=70;
  System.out.println("The modified array is:"+Arrays.toString(array));
	}

}
