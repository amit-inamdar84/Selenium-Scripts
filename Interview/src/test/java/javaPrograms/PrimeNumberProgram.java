package javaPrograms;
//Any number that is only divisible by 1 and itself is a prime number. 3,5,7,11,13....
//To check if N is a prime number we need to divide by numbers from 2 till N/2 because a number is fully divisible from 2 to N/2.
//Exclusions - 0,1 and N are excluded. Beyond N/2 we get a decimal number as remainder.

public class PrimeNumberProgram {
	int num = 13;

	public void checkPrime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {//Loop to check divisibility
			if (n % i == 0) {//if remainder is 0 set flag true and break.
				flag = true;
				break;//No more looping needed as it is not a prime number.
			} else {
				flag = false;//Set flag as false and continue with the loop.
			}

		}
		if (!flag) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNumberProgram obj = new PrimeNumberProgram();
		obj.checkPrime(obj.num);
	}

}
