package com.xworkz.search;
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable{

	    public static void main(String[] args) {
	      Enumeration birds;
	        String key;
	        Hashtable<String, String> hashtable =
	                new Hashtable<String, String>();
	        hashtable.put("Bird1","Pigeon");
	        hashtable.put("Bird2","BlueBird");
	        hashtable.put("Bird3","Swan");
	        hashtable.put("Bird4","Parrot");
	        hashtable.put("Bird5","Sparrow");
	        birds = hashtable.keys();
	        while(birds.hasMoreElements()) {
	            key = (String) birds.nextElement();
	            System.out.println("Key: " +key+ " & Value: " +
	                    hashtable.get(key));
	        }
	    }
	}



