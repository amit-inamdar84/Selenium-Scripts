package javaPrograms;

import java.util.Random;

public class GenerateRandomNumbers {
	public void generateRandomNumbers() {
		Random ram = new Random();

		for (int i = 0; i < 5; i++) {//Generate 5 random numbers.
			int num = ram.nextInt(50);//Generate a random number between 0 and 99
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		GenerateRandomNumbers obj = new GenerateRandomNumbers();
		obj.generateRandomNumbers();
	}

}
