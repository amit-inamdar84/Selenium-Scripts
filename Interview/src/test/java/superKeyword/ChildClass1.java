package superKeyword;
//super keyword must be the first statement in constructor body.
//We can replace default super keyword placed by compiler with super keyword with arguments. This will help us to call the parameterized constructor
//of parent class.

public class ChildClass1 extends ParentClass1{
	
	String name;
	
	ChildClass1(){
		//by default super() is placed here.
		System.out.println("I am child class default constructor");
	}
	
	ChildClass1(String name,int salary, int age){
		super(salary,age);
		this.name=name;	
	}
	
	void display(){
		System.out.println(name+" " +salary+" " +age);
	}
	
	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1("Amit",5000,36);
		obj.display();
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		
		ChildClass1 obj1 = new ChildClass1();
		
	}

}
