package javaAccessModifiers;

public class AccessModifiers1 {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		//obj.test1(); Cannot access test1 method outside class as it is private
		obj.test2();
		obj.test3();
		obj.test4();
		
		//System.out.println(obj.i); Cannot access variable i outside class as it is private
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.p);
	}

}
