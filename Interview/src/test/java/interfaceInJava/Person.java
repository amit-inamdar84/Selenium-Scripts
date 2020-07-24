package interfaceInJava;

public abstract class Person {

	private String name;
	private String gender;

	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;

	}

	abstract void work();

	public void changeName(String newName) {
		name = newName;
	}

	//This below method returns string representation of the object. Here the objects obj and obj1 addresses are converted to their values and printed.
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {

	}

}
