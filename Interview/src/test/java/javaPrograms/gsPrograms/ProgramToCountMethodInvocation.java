package javaPrograms.gsPrograms;

public class ProgramToCountMethodInvocation {
	static int count = 0;

	public void countingMethod() {
		count++;
		// Method implementation
	}

	public static void main(String[] args) {
		ProgramToCountMethodInvocation obj = new ProgramToCountMethodInvocation();
		for (int i = 1; i <= 5; i++) {
			obj.countingMethod();
		}

		System.out.println(count);
	}
}
