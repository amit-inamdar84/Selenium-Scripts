package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public int reverseNumber() {
		int num = 0;
		int reversenum = 0;
		System.out.println("Input your number and press enter: ");
		// This statement will capture the user input
		Scanner in = new Scanner(System.in);
		// Captured input would be stored in number num
		num = in.nextInt();
		// While Loop: Logic to find out the reverse number
		while (num != 0) {
			//reversenum = reversenum * 10;
			reversenum = (reversenum * 10) + num % 10;
			num = num / 10;
		}

		return reversenum;
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		int rev = obj.reverseNumber();
		System.out.println(rev);
	}

}
