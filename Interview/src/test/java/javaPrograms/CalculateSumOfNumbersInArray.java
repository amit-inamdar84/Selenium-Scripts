package javaPrograms;

public class CalculateSumOfNumbersInArray {

	public int caclulateSumOfArray(int[] a) {
		int sum = 0;
		for (int arr : a) {
			sum = sum + arr;
		}
		return sum;

	}

	public static void main(String[] args) {
		CalculateSumOfNumbersInArray obj = new CalculateSumOfNumbersInArray();
		int[] array = { 10, 50, 60, 100 };
		System.out.println(obj.caclulateSumOfArray(array));
	}

}
