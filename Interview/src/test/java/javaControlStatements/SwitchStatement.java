package javaControlStatements;
//Switch variable should be a primitive data type such as int, char, enum, String and wrapper classes.

public class SwitchStatement {
	enum Fruits{
		Mango,
		Orange,
		Apple
	}
	
	public static void main(String[] args) {
		int i = 0;
		char j = 'K';
		switch (i) {
		case 0:// Case values cannot be duplicate
			System.out.println("i is 0");
			break;// Break is optional
		case 1:// case value should be constant or literal.
			System.out.println("i is 1");
			break;
		case 2:// Case value data type must be same as variable in switch
			System.out.println("i is 2");
			break;
		default:// Default is optional and can appear anywhere. See below code
			System.out.println("i is greater than 2");
		}

		switch (j) {
		default://In this case default is first. If there is no break statement, next line of code will execute till it sees a break.
			//if there is no break at all, all statements will execute.
			System.out.println("j is Z");
		case 'A':
			System.out.println("j is A");
			//break;
		case 'B':
			System.out.println("j is B");
			break;
		case 'F':
			System.out.println("j is F");
			break;
		}
		
		Fruits type = Fruits.Orange;
		switch(type){
		case Mango :
			 System.out.println(type);
			 break;
		case Apple:
			System.out.println(type);
			break;
		case Orange:
			System.out.println(type);
			break;
		}

	}
}
