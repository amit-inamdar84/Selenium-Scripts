package inheritance;

import com.amit.web.corejava.InstanceOfOperator;

public class ClassB {
	
	public void test1() {
		System.out.println("Method from ClassB");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.test1();
		int x =obj.a;
		System.out.println(x);
		
		InstanceOfOperator obj1 = new InstanceOfOperator();

	}

}