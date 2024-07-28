package com.xworkz.arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,rem,rev = 0;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the Number:");
num=scanner.nextInt();
while(num!=0)
{
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	
}
System.out.println("The reverse of the  number:"+rev);
	}

}
