package com.xworkz.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {

	static void bucketSorting(float array[], int n)//creating a static method
	{
		if (n <= 0)//condition
			return;
		Vector<Float>[] buckets = new Vector[n];//Collections are using here

		for (int i = 0; i < n; i++) {//loop (initialization, condition, increment)
			buckets[i] = new Vector<Float>();
		}

		for (int i = 0; i < n; i++) {
			float idx = array[i] * n;
			buckets[(int)idx].add(array[i]);
		}

		
		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);//using sorting method in collection
		}

		
		int arrayIndex = 0;
		for (int i = 0; i < n; i++) {
		    int bucketSize = buckets[i].size();
			for (int k = 0; k < bucketSize; k++) {
				array[arrayIndex ++] = buckets[i].get(k);//get is in built method
			}
		}
	}

	public static void main(String args[])
	{
		float array[] = { (float)0.42, (float)0.32,
						(float)0.35, (float)0.52,
						(float)0.39, (float)0.47,
						(float)0.50};//using array as a float because sometimes the rage of the array will in float
       System.out.println("The Original Array is:");
       System.out.println(Arrays.toString(array));//using object method
		int n = array.length;//length is in built method it always give the length of the array 
		bucketSorting(array, n);//Accessing static method

		System.out.println("The Sorted Array is: ");
		System.out.println(Arrays.toString(array));
		}
	}


