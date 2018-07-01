package com.amit.web.corejava;

public class ThisKeyword {
	int i;
	int j;
	
	ThisKeyword(int i, int j) {
		//This is used to refer to current class instance variable when local and global variable are same
		this.i=i;
		this.j=j;
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(6,3);
		System.out.println(obj.i);
		System.out.println(obj.j);

	}

}
