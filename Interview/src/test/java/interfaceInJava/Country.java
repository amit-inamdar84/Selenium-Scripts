package interfaceInJava;
//Abstract class is useful when we know the implementation of few methods and other methods implementation we do not know.

public abstract class Country {

	String getNationality() {
		return "Indian";
	}

	abstract String getName();

	abstract String getGender();

}
