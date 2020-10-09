package javaPrograms;
//Logic: Pass an array and its size to the function.
//Declare 4 variables lowest_sum, sum, firstElement, secondElement
//lowest_sum will hold the sum of numbers that is lowest or close to zero. sum will hold sum of numbers being iterated.
//firstElement will hold the index of number whose sum combined with secondElement is lowest_sum.
//If array size is less than 2 print invalid input.
//Initialize firstElement = 0; firstElement; lowest_sum = arr[0] + arr[1]
//Iterate on array. Start from i=0 and j=i+1. i.e. 1st element and 2nd element.
//Increment i till less than array size - 1. i.e. 4 in this case. We do not need last element as there is no next element to sum with.
//Increment j till less than array size. i.e. 1 to 5 in this case.
//In the inner loop for j assign sum  = element at i and element at j.
//If lowest_sum>sum enter the if condition and assign sum = lowest_sum as this will the next lowest sum possible.
//Now, make element at i as firstElement and element at j as secondElement.
//In this way we iterate the array like this - 1st element will be summed with all other consecutive elements. 2nd element will be summed with all other consecutive elements as so on
//In last iteration, last 2nd element will be summed with last element and loop ends.
//Now we can print element at index firstElement and secondElement as these are the latest numbers whose sum is lowest.

public class TwoElementsWhoseSumIsClosestToZero {

	static void twoElementsWhoseSumIsClosestToZero(int arr[], int arr_size) {

		int lowest_sum, sum, firstElement, secondElement;

		if (arr_size < 2) {
			System.out.println("Invalid Input");
			return;
		}

		firstElement = 0;
		secondElement = 1;
		lowest_sum = arr[0] + arr[1];

		for (int i = 0; i < arr_size - 1; i++) {
			System.out.println("itneration number==" + i);

			for (int j = i + 1; j < arr_size; j++) {

				sum = arr[i] + arr[j];
				System.out.println("sum== " + sum + " arr[i] + arr[j] " + arr[i] + " + " + arr[j]);
				if (Math.abs(lowest_sum) > Math.abs(sum)) {
					System.out.println("lowest_sum== " + sum);
					lowest_sum = sum;
					firstElement = i;
					secondElement = j;
				}
			}
		}

		System.out.println(
				" The two elements whose " + "sum is minimum are " + arr[firstElement] + " and " + arr[secondElement]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 66, -70, 75 };
		twoElementsWhoseSumIsClosestToZero(arr, 6);
	}

}
