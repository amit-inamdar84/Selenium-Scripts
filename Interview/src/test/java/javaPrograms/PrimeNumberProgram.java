package javaPrograms;

public class PrimeNumberProgram {
	int num = 7;

	public void checkPrime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			} else {
				flag = false;
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
