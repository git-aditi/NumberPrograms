package com.company.java.techNumber;

import java.util.Scanner;

public class TechNumberExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");

		// reads an integer from the user
		n = sc.nextInt();

		// assign the value of n into num
		num = n;

		// loop executes until the condition returns false
		while (num > 0) {
			// increments the variable digits by 1
			digits++;

			// removes the last digit of the given number
			num = num / 10;
		}

		if (digits % 2 == 0) {
			num = n;

			// determines the first half of the given number
			firstHalf = num / (int) Math.pow(10, digits / 2);
						
			//determines the second half of given number
			secondHalf = num % (int) Math.pow(10, digits / 2);
			
			//calculate the square of both the number 
			squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
		
			if(n == squareOfSum) {
				System.out.println(n + " is a tech number");
			} else {
				System.out.println(n + " is not a tech number");
			}
		
		} else {
			System.out.println(n + "is not a tech number");
		}

	}

}
