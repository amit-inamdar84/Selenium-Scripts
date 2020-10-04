package javaPrograms;
//In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method.
//Algorithm:
//Step 1: Use while loop to check if 1st element <= last element.
//Step 2: Calculate mid = (first+last)/2. If mid element equals key return mid. If mid<key make first = mid+1 . Else make last = mid-1.
//Step 3: If key element is found, return the index position of the array element
//Step 4: If key element is not found, return -1

public class BinarySearch {
	public static int binSearch(int[] arr, int key){
		int first = 0;
		int last = arr.length-1;
		
		while(first<=last){
			int mid = (first+last)/2;
			if(arr[mid] == key){
				return mid;
			}
			
			else if(arr[mid]<key){
				first = mid+1;
			}
			
			else{
				last = mid-1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2,8,15,20,24,28};
		int key = 15;
		int result = binSearch(arr,key);
		if(result == -1){
			System.out.println("Element not present");
		}
		else{
			System.out.println("Element found at index "+result);
		}
		
	}

}
