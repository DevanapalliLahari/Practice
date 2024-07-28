package com.xworkz.arrays;

public class MedianOfArrays {

	

	    static int findMedian(int a1[],
	            int a2[], int n) {
	        /*
	        i will point to the current index of the first array and j will point the
	        the current index of the second array
	        */
	        int i = 0;
	        int j = 0;

	        /*
	        a counter that counts the elements till the counter reaches n when the counter reaches n elements it means we have reached the median of the two arrays
	        */
	        int count;
	        int firstMedian = -1, secondMedian = -1;

	        for (count = 0; count <= n; count++) {

	            /*
	            when all elements of a1[] are smaller than smallest than the first element of a2[]
	            */
	            if (i == n) {
	                firstMedian = secondMedian;
	                secondMedian = a2[0];
	                break;
	            }
	            /*
	            when all elements of a2[] are smaller than smallest than the first element of a1[]
	            */
	            else if (j == n) {
	                firstMedian = secondMedian;
	                secondMedian = a1[0];
	                break;
	            }

	            if (a1[i] <= a2[j]) {
	                firstMedian = secondMedian;
	                secondMedian = a1[i];
	                i++;
	            } else {
	                firstMedian = secondMedian;
	                secondMedian = a2[j];
	                j++;
	            }
	        }

	        return (firstMedian + secondMedian) / 2;
	    }

	    public static void main(String args[]) {
	        int a1[] = {1, 12, 15, 26, 38};
	        int a2[] = {2, 13, 17, 30, 45};

	        System.out.println("The median of two sorted arrays is: " + findMedian(a1, a2, a1.length));
	    }
	}
