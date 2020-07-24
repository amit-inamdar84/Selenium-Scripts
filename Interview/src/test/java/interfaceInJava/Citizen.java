package interfaceInJava;

public class Citizen extends Country {
	String name;
	String gender;

	Citizen(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	String getGender() {
		return gender;
	}

	void display() {
		System.out.println(
				"Name is: " + getName() + " Gender is: " + getGender() + " Nationality is: " + getNationality());
	}

	public static void main(String[] args) {
		Citizen obj = new Citizen("Amit", "Male");
		obj.display();
	}

}
