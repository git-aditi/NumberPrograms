package com.company.java.sunnyNumber;

import java.util.*;

public class SunnyNumberExample1 {

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		
		//reading a number from the user
		int n = sc.nextInt();
		
		//calling user-defined function
		isSunnyNumber(n);
		
		
	}
	
	//function checks whether given number is a perfect square or not
	static boolean findPerfectSquare(double num) {
		//finds the squre root of the given number
		double square_root = Math.sqrt(num);
		
		//if square root is an integer
		return((square_root - Math.floor(square_root)) == 0);
	}
	
	//function that checks whether the given number is Sunny or not
	static void isSunnyNumber(int n) {
		
		//checks n+1 is perfect square or not
		if(findPerfectSquare(n+1)) {
			System.out.println("The given number is a sunny number.");
		} else {
			System.out.println("The given number is not a sunny number.");
		}
	}
	

}
