package javaPrograms;
//Output: 1,1,2,2,3,3,4,4,5,5,
public class RealTimeFunctions {
	public void printNoForNTimes() {//Function to print no's from 1 to N, n no of times.
		int[] b = new int[10];
		for (int k = 0; k < b.length;) {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 2; j++) {//Loop to control how many times to print each number.
					System.out.println(i);
					b[k] = i;
					k++;
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+",");
		}
	}
	
	public static void main(String[] args) {
		RealTimeFunctions obj = new RealTimeFunctions();
		obj.printNoForNTimes();
	}

}
