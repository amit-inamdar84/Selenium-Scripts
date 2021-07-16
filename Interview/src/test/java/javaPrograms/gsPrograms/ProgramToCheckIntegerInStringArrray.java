package javaPrograms.gsPrograms;

public class ProgramToCheckIntegerInStringArrray {
	
	//Using regex
	public static void checkIntInStringArray(String[] s3){
		for(String str : s3){
			if(str.matches("[0-9]+")){//Match multiple occurences(Using suffix +) of digits from 0-9.
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
	}
	
	public static void main(String[] args) {
		String[] s3 = {"Test", "19", "ABC"};
		checkIntInStringArray(s3);
	}

}
