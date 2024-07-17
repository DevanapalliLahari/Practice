package com.xworkz.sort;
public class BubbleSort {

	 static void print (int arr[]) //function to print array elements  
	    {  
	        
	        for (int i = 0; i < arr.length; i++)  
	        {  
	            System.out.print(arr[i] + " ");  
	        }         
	    }  
	    static void bubbleSort (int arr[])    // function to implement bubble sort  
	    {  
	        
	        for (int i = 0; i < arr.length; i++)  
	        {  
	            for (int j = i + 1; j < arr.length; j++)  
	            {  
	                if (arr[j] < arr[i])  
	                {  
	                    int temp = arr[i];  
	                    arr[i] = arr[j];  
	                    arr[j] = temp;  
	                }  
	            }  
	        }  
	    }  
	    public static void main(String[] args) {    
	    int arr[] = {35, 10, 31, 11, 26};    
	    
	    System.out.println("Before sorting array elements are - ");    
	    BubbleSort.print(arr);  
	    BubbleSort.bubbleSort(arr);  
	    System.out.println();  
	    System.out.println("After sorting array elements are - ");    
	    BubbleSort.print(arr);  
	        
	}    
	}  