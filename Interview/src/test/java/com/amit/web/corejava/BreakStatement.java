package com.amit.web.corejava;

//Break will terminate the loop or program execution based on conditions

//Continue will skip the execution of specified condition and will continue with next value in loop.
//Break will completely stop execution of the loop when specified condition is encountered.
public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		int j = 0;
		while (true) {
			if (j == 5) {
				break;
			}
			j++;
			System.out.println(j);
		}

	}

}
