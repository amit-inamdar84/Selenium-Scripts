package javaPrograms;

public class BubbleSort {
	public static void bubbleSort(int array[]) {
		int temp;
		for (int i = 0; i < array.length; i++) {//Start from i=0 and compare with all other elements one by one by incrementing j. In next iteration of i repeat.
			for (int j = i + 1; j < array.length; j++) {//j should be i+1 as we start with comparing 1st element with 2nd element.
				if (array[i] > array[j]) {//If element at i is greater than element at j
					temp = array[i];//Copy i to temp
					array[i] = array[j];//Copy j to i
					array[j] = temp;//Copy temp to j. This will swap the elements.
				}
			}
			System.out.println("After " + i + " iteration");//After every i iteration smallest element will be placed at 0,1....index
			printArray(array);//Print array after each iteration of j
		}
	}

	public static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] array = { 6,5,4,3,2,1 };
		bubbleSort(array);
	}
}
