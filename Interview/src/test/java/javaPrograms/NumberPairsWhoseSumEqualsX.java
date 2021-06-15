package javaPrograms;
//Consider the input a [] = [8,9,4,5,1,2,0,6], write code to display the pair of numbers which sums to 6. 

public class NumberPairsWhoseSumEqualsX {
	public static void numberPairsSum(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == 6) {
					System.out.println(arr[i] + "" + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 8, 9, 4, 5, 1, 2, 0, 6 };
		numberPairsSum(a);
	}
}
