package interfaceInJava;

public class TestPerson extends Person {
	int id;

	// Child class must implement parent class constructor
	TestPerson(String name, String gender, int id) {
		super(name, gender);
		this.id = id;

	}

	@Override
	void work() {
		if (id == 0) {
			System.out.println("Person is not working");
		}

		else {
			System.out.println("Person is working");
		}

	}

	public static void main(String[] args) {
		TestPerson obj = new TestPerson("Amit","M",10);
		obj.work();
		
		TestPerson obj1 = new TestPerson("Vedha","F",0);
		obj1.work();
		
		obj.changeName("Suspense");
		System.out.println(obj);
		System.out.println(obj1);
		

	}

}
