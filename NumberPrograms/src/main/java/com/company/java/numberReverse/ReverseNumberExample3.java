package com.company.java.numberReverse;

import java.util.Scanner;

public class ReverseNumberExample3 {
	
	//method for reversing a number
	public static void reverseNumber(int number) {
		if(number<10) {
			//prints the same number if number is less than 10
			System.out.println(number);
		} else {
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number that you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("The reverse of the given number is: ");
		//method calling
		reverseNumber(num);
		
		
	}

}
