package javaPrograms;
//Here for 1st element we are comparing all other array elements. Initialize index to 1st element.i.e. i=0
//If smaller element is found we are making that as index. In 1st iteration after 1st element is compared with all other elements, store element at index in
//temp variable. Now swap elements at ith position with element at index position.
//In next ith iteration index will be at i=1 and compare with remaining elements. The next smallest number will be placed at 2nd position in this iteration.

public class SelectionSort {
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {//Start with 0th index as usual.
			int index = i;//Initialize index to 1st element position
			for (int j = i + 1; j < array.length; j++) {//Start j with 2nd element in the array.
				if (array[j] < array[index]) {//Find next element that is smaller than index.
					index = j;//Assign index to that smaller element. Repeat for first pass.
				}
			}
			int temp = array[index];//After first pass, swap the smallest element with first element. 
			array[index] = array[i];//Repeat till i traverses all elements in the array.
			array[i] = temp;
		}
		return array;
	}

	public static void print(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 10, 5, 8 };
		int[] result = selectionSort(array1);

		print(result);
	}

}
