package javaPrograms;
//Take two int variables to hold firstBigNumber and secondBigNumber and assign 0.
//Take the first array element and check if num > firstBigNumber. If yes make it the firstBigNumber and assign previous value to secondBigNumber.
//If next element in array is not greater than firstBigNumber the check if it is greater than secondBigNumber. If yes assign it to secondBigNumber.
//Rest of the elements that do not belong to if or else part will be discarded from output.

public class TwoMaxNumbersInArray {

	public void twoMaxNumbers(int[] a) {
		int firstBigNumber = 0;
		int secondBigNumber = 0;

		for (int num : a) {
			if (num > firstBigNumber) {//If next array element is not bigger move to else condition
				secondBigNumber = firstBigNumber;//We have a new big number. Give space for it.
				firstBigNumber = num;//As we now have space in firstBigNumber assign the array element to it and move to next element in array
				System.out.println(firstBigNumber);
				System.out.println(secondBigNumber);
			}

			else if (num > secondBigNumber) {//Are you bigger than secondBigNumber? If yes enter. If not move to next element in array.
				secondBigNumber = num;//As we have a secondBigNumber now assign the next element to secondBigNumber.
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
