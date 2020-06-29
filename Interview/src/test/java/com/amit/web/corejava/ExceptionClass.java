package com.amit.web.corejava;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//Exception handling is a mechanism to handle the run time errors so that the normal flow of the application can be maintained
//Exception type: Checked exceptions and Unchecked exceptions.
//The classes that extends Throwable class except Runtime and Error are known as checked exceptions. Ex: FileNotFoundException, classNotFoundException,
//InterruptedException
//The classes that extend RuntimeException are known as unchecked exceptions.
//Error is irrecoverable. Ex: OutOfMemoryError, VirtualMachineError, AssertionError etc.
//Exception class is parent class for both checked and unchecked exceptions. That is why in catch block we write - catch(Exception e) 


public class ExceptionClass extends TestException{
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
    
	//Checked exception - Compile time error
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
    
	//Checked exception - Compile time error
	public void classNotFoundException() throws ClassNotFoundException {
		Class.forName("TTE");
	}
	
	public void classCastException() {
		//Below code will give error as we cannot cast parent class object to child class type
		TestException obj = new TestException();
		System.out.println((ExceptionClass)obj);
		
		////Below code will run fine as we can cast child class object to parent class type
		/*ExceptionClass obj1 = new ExceptionClass();
		System.out.println((TestException)obj1);*/
	}
	
	public void numberFormatException(){
		String s = "Test";
		int t = Integer.parseInt(s);
	}
	
    //Checked exception
	public void test() throws InterruptedException{
		Thread.sleep(1000);
	}
	
	public void tryCatch() {
		//exception class is parent of all checked and unchecked exceptions
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Below catch blocks are invalid (compile time error) as we cannot use child class
		// exceptions when parent is already handling
		/*
		 * catch (ArithmeticException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * catch (ArrayIndexOutOfBoundsException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}
	
	public void tryCatch1() {
		//Here if the exceptions are not caught by any catch block the exception class at the end will catch it.
		try {
			int[] a = new int[5];
			a[4] = 30 / 1;
			String s = null;
			s.toCharArray();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 catch (ArrayIndexOutOfBoundsException e) { // TODO Auto-generated catch block
		 e.printStackTrace(); }
		 
		 catch (Exception e) { 
		 e.printStackTrace(); 
		 }
		System.out.println("All exceptions failed. Parent class caught the exception that was not defined");
		 
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
		//Try catch block within a try block in known as nested try catch block
		// If first inner try block catches the exception, second inner try block will execute.
		// If second try block also catches the exception, outer catch block will not execute.
		try {
			try {
				int[] a = new int[5];
				a[5] = 30 / 0;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Catching exception in first inner try catch block");
				//throw new ArithmeticException("Arithmetic exception");
			}
			
			try {
				int[] a = new int[5];
				a[5] = 30 / 5;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Catching exception in second inner try catch block");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Outer catch block 1");
		}
		System.out.println("Ending all blocks");
	}
	
	public void nestedTryBlock1() {
		//If there is uncaught exception in first inner try block, it will skip the remaining code and go to outer catch block.
		try {
			try {
				String s1 = null;
				s1.toLowerCase();//This null pointer exception is uncaught
				int[] a = new int[5];
				a[5] = 30 / 0;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				//throw new ArithmeticException("Arithmetic exception");
			}
			// This block will not execute if above blocks exception is uncaught
			try {
				int[] a = new int[5];
				a[5] = 30 / 5;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("This block will not execute");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Outer catch block 1");
		}
		System.out.println("Ending all blocks");
	}
	
	public void nestedTryBlock2() {
		//Try catch block within a try block in known as nested try catch block
		//Here exception thrown by first inner try block will be caught. Then forcibly throwing exception using throw keyword will stop execution and
		//pass control to outer catch block.
		// Second inner try will not be executed
		try {
			try {
				int[] a = new int[5];
				a[5] = 30 / 0;
			} catch (ArithmeticException e) {
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
			e.printStackTrace();
			System.out.println("Outer catch block 1");
		}
		System.out.println("Ending all blocks");
	}

	public void tryFinally() {
		//Finally block will always run whether we have handled the exception or not
		//Instead of catch we can use finally block
		//Even if we have catch block its is executed and also finally block is executed
		//After encountering exception if we want to close DB connection, close file etc we can use finally
		//even after return statement in method finally will execute
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} finally {
			System.out.println("Who cares about exceptions. I am executing");
		}
	}
	
	public boolean tryFinally1() {
		//Finally block will execute even after return statement.
		try {
			return true;
			
		} finally {
			System.out.println("Tresspassing return statement");
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionClass obj = new ExceptionClass();
		 //obj.divide();
		//obj.concatentate();
		//obj.stackoverflow();
		//obj.fileNotFound();
		//obj.illegalStateException();
		//obj.arrayIndexOutOfBound();
		//obj.classNotFoundException();
		 //obj.classCastException();
		//obj.numberFormatException();
		//obj.test();
		//obj.tryCatch();
		//obj.tryCatch1();
		//obj.nestedTryBlock();
		//obj.nestedTryBlock1();
		//obj.nestedTryBlock2();
		//obj.tryFinally();
		obj.tryFinally1();

	}

}
