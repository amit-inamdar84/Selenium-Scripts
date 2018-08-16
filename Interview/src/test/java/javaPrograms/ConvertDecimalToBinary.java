package javaPrograms;

import java.util.ArrayList;

//Binary of 0=0
//Binary of 1=1
//Binary of 2=10
//Binary of 3=11
//Binary of 4=100
//Binary of 5=101
//Binary of 6=110
//Binary of 7=111	
//Binary of 8=1000
//Binary of 9=1001
//Binary of 10=1010

public class ConvertDecimalToBinary {
	public void convertDecimalToBinary(int number) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		while (number > 0) {
			obj.add(number % 2);
			number = number / 2;
		}

		int length = obj.size() - 1;
		while (length >= 0) {
			System.out.println(obj.get(length));
			length--;
		}
	}

	public static void main(String[] args) {
		ConvertDecimalToBinary obj = new ConvertDecimalToBinary();
		obj.convertDecimalToBinary(9);
	}

}
