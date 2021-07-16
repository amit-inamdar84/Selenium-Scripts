package javaPrograms.gsPrograms;

public class FindIndexOfElementsWhoseSumIsX {

	public static void numberPairsSum(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == 13) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 5, 8, 9, 7 };
		numberPairsSum(a);
	}

}
