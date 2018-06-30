package com.amit.web.corejava;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Pre-increment: "+ ++n);
		System.out.println("Increment: "+ n++);
		System.out.println("Post-increment: "+n);
		
		System.out.println("------------------------");
		
		int k=2;
		System.out.println("Pre-decrement: "+ --k);
		System.out.println("Decrement: "+ k--);
		System.out.println("Post-decrement: "+k);
		
		System.out.println("------------------------");
		
		int i=0;
		int j=i++ + ++i; //0+2
		System.out.println(j);
		System.out.println("------------------------");
		
		int p=1;
		int q=++p + p++;//2+2
		System.out.println(q);
		System.out.println("------------------------");
		
		int l=0;
		int m=l++ + ++l + ++l + l++;//0+2+3+3
		System.out.println(m);

	}

}
