package javaPrograms;
//In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
//For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.

public class PerfectNumber {
	public void isPerfect(int number) {
		int temp = 0;//Required for storing divisor value temporarily
		for (int i = 1; i <= number / 2; i++) {//A number is fully divisible from 1 to half of its value.
			if (number % i == 0) {//Keep diving to find divisors that give remainder as 0.
				temp = temp + i;
			}
		}
		if (temp == number) {//If sum of all its divisors is equal to number itself.
			System.out.println(number + " is perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}

	public static void main(String[] args) {
		PerfectNumber obj = new PerfectNumber();
		obj.isPerfect(28);
	}

}
