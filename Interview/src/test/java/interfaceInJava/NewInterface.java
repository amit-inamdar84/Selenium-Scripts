package interfaceInJava;
//Since Java 8, default methods in interface are introduced
//If we change unimplemented methods or add new ones all implementing classes will throw compile time error to add
//unimplemented methods
//To avoid this if we add new default implemented methods we can call those methods in implementing classes
//using object reference
//New interface methods should start with default keyword and provide an implementation
//Like old methods these default methods are implicitly public
//Since java 8 we also have static methods in interface which saves memory. When multiple classes want to use same method
//we can define static method and save memory

public interface NewInterface {
	
	public void abc();
	default String xyz() {
		return "new default interface";
	}
	
	static int add(int a , int b) {
		return a+b;
	}

}
