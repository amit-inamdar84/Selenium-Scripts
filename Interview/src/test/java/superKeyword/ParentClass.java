package superKeyword;
//Super Keyword is used to refer to the immediate parent class object
//When methods and variables are same in parent class, super is used to resolve the ambiguity
//Need to revisit super used to call parent class constructor
//Super can be used to call parent class method that is overridden

public class ParentClass {
	public String color = "White";
	
	public void run() {
		System.out.println("Parent class run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
