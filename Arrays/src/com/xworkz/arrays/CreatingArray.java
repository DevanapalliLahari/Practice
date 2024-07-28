package com.xworkz.arrays;

import java.util.Arrays;

public class CreatingArray {

	public static void main(String[] args) {
		//int[] array = new int[] { 10, 2, 7, 3, 23, 16, 29 };//object initialization
		int a =28;
		int b =35;//literals
		int c =20;
		int [] array= {a,b,c};
		int a1=array[0];
		int b2=array[1];
		int c2=array[2];
		System.out.println("reference of a: "+a1);
		System.out.println("reference of b: "+b2);
		System.out.println("reference of c: "+c2);
           int c1=array[0];
           System.out.println(c1);
		//System.out.println("The values of array is:" + Arrays.toString(array));
	}

}
