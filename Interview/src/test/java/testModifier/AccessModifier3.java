package testModifier;

import javaAccessModifiers.AccessModifiers;

public class AccessModifier3 extends AccessModifiers {

	public static void main(String[] args) {
		//We can access public and protected variable and methods using inheritance
		AccessModifier3 obj = new AccessModifier3();
		obj.test3();
		obj.test4();

		System.out.println(obj.k);
		System.out.println(obj.p);

	}

}
