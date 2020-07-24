package com.amit.web.corejava;
//if(condition)

public class IfBlocks {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		if (i > 15) {
			System.out.println("I am in if");
		}
		System.out.println("I am not in if");

		boolean status = true;
		if (status) {
			System.out.println("If got executed");
		}
		System.out.println("Outside if got executed");

		if (j < 19) {
			System.out.println("if block executed");
		} else {
			System.out.println("Else block got executed");
		}
	}

}
