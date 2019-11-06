package com.class4;

import java.util.Scanner;

public class Task2ForScanner {

	public static void main(String[] args) {
		Scanner age=new Scanner(System.in);
		System.out.println("What is your age");
		int enterage=age.nextInt();
		
		if (enterage>18) {	
			System.out.println("You will get a licence");
		}else {
			System.out.println("You need a permint");
		}
		
		
		
		
	}

}
