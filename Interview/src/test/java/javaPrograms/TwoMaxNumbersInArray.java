package javaPrograms;

public class TwoMaxNumbersInArray {

	public void twoMaxNumbers(int[] a) {
		int firstBigNumber = 0;
		int secondBigNumber = 0;

		for (int num : a) {
			if (num > firstBigNumber) {
				secondBigNumber = firstBigNumber;
				firstBigNumber = num;
				System.out.println(firstBigNumber);
				System.out.println(secondBigNumber);
			}

			else if (num > secondBigNumber) {
				secondBigNumber = num;
				System.out.println(secondBigNumber);
			}
		}
		System.out.println("First Big Number is: " + firstBigNumber);
		System.out.println("Second Big Number is: " + secondBigNumber);
	}

	public static void main(String[] args) {
		int[] a = { 0, 10, 50, 40, 15 };
		TwoMaxNumbersInArray obj = new TwoMaxNumbersInArray();
		obj.twoMaxNumbers(a);
	}

}
