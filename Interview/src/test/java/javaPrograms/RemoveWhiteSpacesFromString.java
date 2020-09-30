package javaPrograms;

public class RemoveWhiteSpacesFromString {
	String s = "Remove space";
	String s1 = " Beginandendspace ";
	
	public void removeSpace(String str, String str1){
		System.out.println("Before replace: "+str);
		String replace = str.replaceAll("\\s", "");
		System.out.println("After replace: "+replace);
		System.out.println("Before trim:"+str1);
		String trim = str1.trim();
		System.out.println("After trim:"+trim);
	}
	
	public static void main(String[] args) {
		RemoveWhiteSpacesFromString obj = new RemoveWhiteSpacesFromString();
		obj.removeSpace(obj.s,obj.s1);
	}

}
