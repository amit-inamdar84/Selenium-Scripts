package javaPrograms.gsPrograms;

public class ProgramToCountObjects {
	static int count = 0;

	{
		count = count + 1;
	}

	public ProgramToCountObjects() {

	}

	public ProgramToCountObjects(int n) {

	}

	public ProgramToCountObjects(String a) {

	}

	public static void main(String[] args) {
		ProgramToCountObjects obj1 = new ProgramToCountObjects();
		ProgramToCountObjects obj2 = new ProgramToCountObjects(3);
		ProgramToCountObjects obj3 = new ProgramToCountObjects("String");
		System.out.println(ProgramToCountObjects.count);
	}

}
