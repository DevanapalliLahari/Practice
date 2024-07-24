package com.xworkz.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="lahari";
char target='a';
System.out.println(search(name,target));
	}
public static boolean search(String str,char target)
{
	if(str.length()==0)
	{
	return false;	
	}
	for(int i=0;i<=str.length();i++)
	{
	if(target==str.charAt(i));
	{
		return true;
	}
	}
	return false;
	
}
}
