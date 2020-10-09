package javaPrograms;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
*/

public class PatternProgram2 {
	public static void main(String[] args) {
		//How many times should print in 1st iteration? That is i's initial value.
		//Pattern ends after printing number N. So N should be i's end point.
		for (int i = 1; i <= 7; i++) {
			//What should be printed in each iteration? i's initial value and end value will decide that.
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");//Replacing i with * will print *'s in same pattern
			}
			System.out.println();
		}
	}

}
