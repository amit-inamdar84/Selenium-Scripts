package strings;
//String builder is same as string buffer class except that it is non-synchronized

//Difference between String buffer and String builder
//String buffer is synchronized. Data corruption will not happen. i.e.two threads cannot call the methods of String buffer simultaneously. String builder
//is non synchronized.
//String builder is more efficient than String buffer because threads will not wait for another thread to finish acting on a method.
//All methods in string builder are same as buffer

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
