package javaPrograms.gsPrograms;

import java.util.LinkedHashSet;

public class DeleteDuplicateArrayElements {
	public static void removeDuplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.print(set);
	}

	public static void main(String[] args) {
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		removeDuplicates(a);
	}

}
