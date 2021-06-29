package javaPrograms;

public class MergeArrays {
	public static void merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[7];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 9, 7, 1 };
		int[] b = { 3, 5, 4 };
		merge(a, b);

	}
}
