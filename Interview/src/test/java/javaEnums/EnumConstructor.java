package javaEnums;

public enum EnumConstructor {
	APPLE,BANANA,POMEGRANATE;
	
	//This constructor will be called 3 times once for each constant.
	EnumConstructor(){
		System.out.println("Testing default constructor of enum");
	}
	
	public static void main(String[] args) {
		System.out.println(EnumConstructor.POMEGRANATE);
	}

}
