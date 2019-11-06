package com.class4;

import java.util.Scanner;

public class TaskForScanner {

	public static void main(String[] args) {

		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		int num1=keyboard.nextInt();
		
		if (num1<200000) {
			System.out.println(" we can do it ");
			
		} else if (num1 == 200000) {
			System.out.println(" Maybe we can do ");
		}else {
			System.out.println(num1 +" get out of here " );
	}

}
}