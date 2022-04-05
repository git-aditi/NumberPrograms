package com.company.java.techNumber;

public class TechNumberExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tech numbers between 1 to 1000000 are: ");
		for (int i = 1; i <= 1000000; i++) {
			// determines the last digit of the given number
			int firstHalf = i / 100;
			// removes the last digit of the number
			int secondHalf = i % 100;
			// add the two parts i.e. p1 and p2
			int sum = firstHalf + secondHalf;
			// square the sum that we get from the above statement and compare the square
			// with the given number
			if (i == (sum * sum))
				// prints the tech number
				System.out.println(i);
		}

	}

}
