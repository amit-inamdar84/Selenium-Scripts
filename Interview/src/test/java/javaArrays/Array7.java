package javaArrays;
//Different ways of creating and initializing arrays



public class Array7 {

	public static void main(String[] args) {
		
		//Declaration
		int a[] = new int[3];
		int[] b = new int[3];
		int c[] = {4,5,8};
		
		//Initialization
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		
		b = new int[]{8,10,3};
		
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

	}

}
