package superKeyword;

public class ChildClass extends ParentClass{
	public String color = "Black";
	
	void display() {
		System.out.println("Color is: " +color);
		System.out.println("Color is: " +super.color);
	}
	
	public void run() {
		super.run();
		System.out.println("Child class run method");
	}


	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.display();
		obj.run();

	}

}
