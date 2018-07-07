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

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {

	}

}
