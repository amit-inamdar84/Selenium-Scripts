package javaPrograms.gsPrograms;

public class DisplayStringInPhoneFormat {
	
	public static void strFormat(String str){
		System.out.println("("+str.substring(0,3)+")"+str.substring(3, 5)+"-"+str.substring(5, 7)+"-"+str.subSequence(7, 10));
	}
	
	public static void main(String[] args) {
		String str = "9138278422";
		strFormat(str);
	}

}
