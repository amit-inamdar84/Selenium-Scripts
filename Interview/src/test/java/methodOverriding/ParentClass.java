package methodOverriding;

public class ParentClass {
	
	public void test1() {
		System.out.println("Parent class test1 method");
	}
	
	//Private method cannot be overridden
	private void test2() {
		System.out.println("Parent class private method");
	}
	
	public static void test3() {
		System.out.println("Parent class static method");
	}
	
	final public void test4() {
		System.out.println("Parent class final method");
	}

	public static void main(String[] args) {
		// TODO Auto-	 method stub

	}

}
