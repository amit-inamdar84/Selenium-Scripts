package encapsulation;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		obj.setAge(25);
		System.out.println(obj.getAge());
		
		//Without setting, if we access we get 0
		A obj1 = new A();
		//obj1.setAge(50);
		System.out.println(obj1.getAge());

	}

}
