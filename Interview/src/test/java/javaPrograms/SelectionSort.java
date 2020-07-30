package javaPrograms;

public class SelectionSort {
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {//Start with 0th index as usual.
			int index = i;//Initialize index to 1st element position
			for (int j = i + 1; j < array.length; j++) {//Start j with 2nd element in the array.
				if (array[j] < array[index]) {//Find next element that is smaller than index.
					index = j;//Assign index to that smaller element. Repeat for first pass.
				}
			}
			int smallIndex = array[index];//After first pass, swap the smallest element with first element. 
			array[index] = array[i];//Repeat till i traverses all elements in the array.
			array[i] = smallIndex;
		}
		return array;
	}

	public static void print(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 10, 34, 2, 5, 6, 88, 66 };
		int[] result = selectionSort(array1);

		print(result);
	}

}
