package strings;
//String builder is same as string buffer class except that it is non-synchronized

//Difference between String buffer and String builder
//String buffer is synchronized. Data corruption will not happen.
//String builder is more efficient than String buffer
//All methods in string builder as same as buffer

public class StringBuild {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		StringBuilder sd = new StringBuilder();

		long startTime = System.currentTimeMillis();
		//long finishTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			sb.append("Test performance");
		}
		System.out.println("Time taken by String Buffer: " +(System.currentTimeMillis()-startTime)+ "ms");
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sd.append("Test performance");
		}
		System.out.println("Time taken by String Builder: " +(System.currentTimeMillis()-startTime)+ "ms");
	}
}
