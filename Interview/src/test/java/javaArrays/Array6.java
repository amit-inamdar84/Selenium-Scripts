package javaArrays;

public class Array6 {
	String title;
	String author;
	
	Array6(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		//Declaring and initializing an array which is of class type Array6
		Array6[] obj = new Array6[3];
		int x = 0;
		//At index obj[0] we are inserting the objects of class type Array6.
		//And also calling constructor to initialize instance variables.
		obj[0] = new Array6("Head First Java","Bob");
		obj[1] = new Array6("Java Cookbook","Sue");
		obj[2] = new Array6("Selenium","Ian");
		
/*		obj[0].title = "Head First Java";
		obj[1].title = "Java Cookbook";
		obj[2].title = "Selenium";

		obj[0].author = "Bob";
		obj[1].author = "Sue";
		obj[2].author = "Ian";*/

		while (x < 3) {
			System.out.print(obj[x].title);//Accessing array elements(objects and their values)
			System.out.print(" by ");
			System.out.println(obj[x].author);
			x = x + 1;
		}

	}

}
