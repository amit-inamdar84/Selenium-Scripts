package encapsulation;

/**
 * 
 * Encapsulation - Binding of code and data together Provides data security 
 * We can make a class read-only or write-only 
 * We can create a fully encapsulated class in Java by making all data members of class private 
 * We can then use getter and setter methods to access the private member outside the class 
 * The object that sets the data only that object can get the data. No data sharing between objects
 * We can insert conditions inside setter methods to prevent unauthorized data to instance variables
 */

public class A {
	private int age;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 10) {
			this.id = id;
		}
		else {
			System.out.println("Failed to set ID");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
