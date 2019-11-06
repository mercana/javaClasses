package com.class5;

import java.util.Scanner;

public class task1forClass5 {

	public static void main(String[] args) {
int day=2;

if (day>=2 && day<=5) {
	System.out.println("It is a weekday");
} else if (day==6 || day==7) {
	System.out.println("It is a weekend");
}else {
	System.out.println("invalid day");
}
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your height in inches");
	int height=scan.nextInt();
	double height1=height/12;
	if (height<5) {
		System.out.println("You are short");
	}else if (height1>=5 && height1<=6) {
	System.out.println("You are medium");
	}else if (height1>6) {
		System.out.println("You are tall");
	}
	
	
	}

}
