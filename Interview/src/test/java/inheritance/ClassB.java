package inheritance;

import com.amit.web.corejava.InstanceOfOperator;

public class ClassB extends ClassA{
	
	public void test1() {
		System.out.println("Method from ClassB");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.test1();
		int x =obj.a;
		System.out.println(x);
		
		ClassA obj1 = new ClassB();
		obj1.test1();

	}

}
