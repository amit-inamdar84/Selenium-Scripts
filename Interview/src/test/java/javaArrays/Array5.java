package javaArrays;

public class Array5 {
	String title;
	String author;
	
/*	Array5() {
		
	}*/

	public static void main(String[] args) {
		Array5[] obj = new Array5[3];
		int x = 0;
		obj[0] = new Array5();
		obj[1] = new Array5();
		obj[2] = new Array5();
		
		obj[0].title = "Head First Java";
		obj[1].title = "Java Cookbook";
		obj[2].title = "Selenium";

		obj[0].author = "Bob";
		obj[1].author = "Sue";
		obj[2].author = "Ian";

		while (x < 3) {
			System.out.print(obj[x].title);
			System.out.print(" by ");
			System.out.println(obj[x].author);
			x = x + 1;
		}

	}

}
