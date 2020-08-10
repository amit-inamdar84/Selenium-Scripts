package javaPrograms;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class PatternProgram3 {
	public static void main(String[] args) {
		//Approach: See the pattern. We need to print 1 and in next line increase count by 1.
		//So after 1st iteration print a new line and in 2nd iteration print 1 number more than previous iteration.
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
        //After 7 iterations, need to print 1 number less than previous iteration. So decide i's initial value. i's end value will be 1.
		//Need to make i-- because we need to print 1 number less than previous iteration.
		for (int i = 6; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
