package com.company.java.automorphicNumber;

public class AutomorphicNumberExample1 {

	//user-defined static method that checks whether the number is
	static boolean isAutomorphic(int num) {
		//determines the square of the specified number
		int square = num * num;
		
		//comparing the digits until the number becomes 0
		while(num>0) {
			//find the remainder(last digit) of the variable num and sq
			if(num%10 != square%10) {
				//returns false if digits are not equal
				return false;
			}	
				//reduce num and square by dividing them by 10
				num = num/10;
				square = square/10;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//number to be checked
		//calling the method and prints the result accordingly
		System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
		System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
		
		

	}

}
