package javaPrograms;

public class PerfectNumber {
	public void isPerfect(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = temp + i;
			}
		}
		if (temp == number) {
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
