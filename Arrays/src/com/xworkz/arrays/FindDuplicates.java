package com.xworkz.arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr=new int[] {20,56,72,90,54,73,63,56,90};
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	if(arr[i]==arr[j])
    	{
    	
    		System.out.println(arr[j]);
    	}
    	
    }
	}

}
