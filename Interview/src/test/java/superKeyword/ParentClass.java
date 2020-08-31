package superKeyword;
//Super Keyword is used to refer to the immediate parent class object
//When methods and variables are same in base class as against derived class, super is used to resolve the ambiguity by preceding derived class
//features with super keyword. (ChildClass.java). Super is used to access parent class data members when there is ambiguity.
//Next it is used to explicitly call no-arg and implicitly call parameterized constructor of parent class. (See classes - ParentClass1 and ChildClass1)
//It is also used to access the parent class methods when child class has overridden that method.
//When we create an object and use that to refer a variable (which is same in parent class), current class variable gets preference.


public class ParentClass {
	public String color = "White";
	
	public void run() {
		System.out.println("Parent class run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
