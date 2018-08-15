package javaPrograms;
//Output: a3b2c2d1

public class CompressString {
	String s1 = "aaabbccd";
	
	public void compressString(String s1){
		int count = 0;
		char temp = s1.charAt(0);
		System.out.println("Length of string: " +s1.length());
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==temp){
				count++;
			}
			else{
				System.out.print(temp+""+count);
				count=1;
				temp=s1.charAt(i);
			}
		}
		System.out.print(temp+""+count);
	}

	public static void main(String[] args) {
		CompressString obj = new CompressString();
		obj.compressString(obj.s1);

	}

}
