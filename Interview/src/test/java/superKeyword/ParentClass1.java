package superKeyword;
//Program to demonstrate calling no-arg and parameterized constructor using super keyword.
//When we create the object of sub class, the new keyword invokes the constructor of child class, which implicitly invokes the constructor of parent class.
//So the order to execution when we create the object of child class is: parent class constructor is executed first and then the child class constructor
//is executed. It happens because compiler itself adds super()(this invokes the no-arg constructor of parent class) as the first statement in the constructor
//of child class.

public class ParentClass1 {

	int salary;
	int age;

	ParentClass1() {
		System.out.println("I am parent class default constructor");
	}

	ParentClass1(int salary, int age) {
		this.salary = salary;
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

}
