package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			
			if(i==2) {
				break; 
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		System.out.println("*******************8");
		
		
		
		{

	for (int a=0; a<10; a++) {
		
		if(a==4) {
			continue; 
		}
		System.out.println(a);
	}
	System.out.println("I am outside of the loop");
	
	
}
}
}