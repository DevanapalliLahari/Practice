package com.xworkz.arrays;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {56,83,62,10,93,36,65,49};
System.out.println(MaxSubArray.max(arr));
	}
	static int max(int [] arr) {
int length=arr.length;
int maxStart = 0;
int maxEnd = 0;
for(int i=0;i<length;i++)
{
	for(int j=i;j<length;j++)
	
		maxEnd=maxEnd+arr[i];
		if(maxStart<0)
			maxStart=0;
	if(maxStart<maxEnd)
		maxStart=maxEnd;
	
}
return maxStart;
	}

}
