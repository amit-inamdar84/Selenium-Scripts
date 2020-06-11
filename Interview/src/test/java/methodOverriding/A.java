package methodOverriding;
//The data type in argument list must be same when overriding.

public class A {
	
	public void test(int a, double b) {
		System.out.println("From A");
	}
	
	int test1(){
		System.out.println("test 1 from parent");
		return 8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
