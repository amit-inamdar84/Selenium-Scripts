package javaPrograms;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

public class PatternProgram1 {
	public static void main(String[] args) {
		//We need to check how many times j should print. With that number i must be initialized.
		//In last iteration how many times j should print? That number should be i's end point.
		for (int i = 1; i <= 7; i++) {
			//Controls how many numbers to print. 1 to N or N to 1 can also be decided.
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");//What to print is upto user. Instead of j, i can be printed or any other symbols can be printed.
			}
			//Prints new line after every iteration of i. The above loops have no role in pattern making. They just print numbers.
			System.out.println();
		}
	}

}
