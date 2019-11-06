package com.class4;

public class Task2Java {

	public static void main(String[] args) {

		double rate=4.5;
		double price=200000;
		if (rate>=4.5) {
			System.out.println("I am noy buying the house");
		}else {
			System.out.println("I will consider buying the house");
			
			if (price>200000) {
				System.out.println("I will need a loan to by house");
			}else {
				System.out.println("I will pay cash for my house");
			}
		}
		
	}

}
