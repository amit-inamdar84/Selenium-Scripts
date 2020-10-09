package javaLoops;

public class DoWhile {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("Value of i is: " + i++);
		} while (i < 5);
		
		System.out.println("-----------------------------------------");
		//Printing even numbers.
		int j = -2;
		do{
			j=j+2;
			System.out.println("Even numbers: "+j);
		}while(j<=8);
		System.out.println("-----------------------------------------");
		
		//Printing odd numbers.
		int x = -1;
		do{
			x=x+2;
			System.out.println("Odd numbers: "+x);
		}while(x<9);
		System.out.println("-----------------------------------------");
		
		//Another way to print even/odd numbers
		int y = 1;
		do{
			y++;
			System.out.println("Another way: "+y++);
		}while(y<10);
	}

}
