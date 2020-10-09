package javaPrograms;
//Algorithm:
//Step 1: Traverse the array
//Step 2: Match the key element with array element
//Step 3: If key element is found, return the index position of the array element
//Step 4: If key element is not found, return -1

public class LinearSearch {
	public static int linearSearch(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 5;
		a[2] = 66;
		a[3] = 78;
		a[4] = 13;
		int key = 100;
		System.out.println(linearSearch(a,key));
	}

}
