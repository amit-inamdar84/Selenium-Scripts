package com.amit.web.corejava;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionClass {
	double d;
	int i = 10;
	int j = 0;
	String s;

	// Arithmetic exception
	public void divide() {
		d = i / j;
	}

	// Null pointer exception
	public void concatentate() {
		System.out.println(s.concat("Test"));
	}

	// Stack overflow exception
	public void stackoverflow() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			array.add(10);
		}
	}

	public void fileNotFound() throws FileNotFoundException {
		FileReader f = new FileReader("C:\\Test.xlsx");
	}

	public void illegalStateException() {
		String s = "abcd";
		Scanner scanner = new Scanner(s);
		System.out.println("" + scanner.nextLine());
		scanner.close();
		System.out.println("" + scanner.nextLine());
	}

	public void arrayIndexOutOfBound() {
		int[] a = new int[5];
		System.out.println(a[6]);
	}

	public void classCastException() throws ClassNotFoundException {
		Class.forName("TTE");
	}

	public void tryCatch() {
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Below catch blocks are invalid as we cannot use child class
		// exceptions when parent is already handling
		/*
		 * catch (ArithmeticException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * catch (ArrayIndexOutOfBoundsException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}

	public void multipleTryCatch() {
		// Here exception thrown by catch block are caught by outer catch blocks
		try {
			try {
				int[] a = new int[5];
				a[5] = 30 / 0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Inner try catch");
				throw new ArithmeticException("Arithmetic exception");
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Outer catch block 1");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Outer catch block 2");
		}
		System.out.println("Ending all blocks");
	}

	public void nestedTryBlock() {
		// Here exception thrown by first inner try block will catch and then go
		// to outer catch block
		// Second inner try will not be executed
		try {
			try {
				int[] a = new int[5];
				a[5] = 30 / 0;
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				throw new ArithmeticException("Arithmetic exception");
			}
			// This block will not execute if above try and then in catch throw
			// exception
			try {
				int[] a = new int[5];
				a[5] = 30 / 5;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("This block will not execute");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Outer catch block 1");
		}
		System.out.println("Ending all blocks");
	}

	public void tryFinally() {
		//Instead of catch we can use finally block
		//even if we have catch block its is executed and also finally block is executed
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} finally {
			// TODO Auto-generated catch block
			System.out.println("Who cares about exceptions. I am executing");
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionClass obj = new ExceptionClass();
		// obj.divide();
		// obj.concatentate();
		// obj.stackoverflow();
		// obj.fileNotFound();
		// obj.illegalStateException();
		// obj.arrayIndexOutOfBound();
		// obj.classCastException();
		obj.tryFinally();

	}

}
