package com.class14;

public class Tasks {

	public static void main(String[] args) {
	/*
* Create a String that will hold a sentence. Write a program to get a new String without any spaces.
*Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
		 */
		
//Task1		
String str="This is My Code";
        
        System.out.println(str.replaceAll(" ", ""));
        
        System.out.println("********************");
        
        //Task2
        String str2="he34llo673&$";
        String str3=str2.replaceAll("[^a-zA-Z]", "");
        System.out.println(str3.length());
        
        System.out.println("***********************");
        
        //Task2
        String a="Is it Saturday? Is it raining? Do we have class today?";
        String[] array=a.split("\\?");
        System.out.println(array.length);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i].trim());

	}

}
}