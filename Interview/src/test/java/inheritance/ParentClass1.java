package inheritance;

public class ParentClass1 {

	ParentClass1() {
		System.out.println("Parent classs default constructor");
	}

	ParentClass1(int i) {
		System.out.println("Parent classs para constructor");
	}

	public void test1() {

	}

	public static void main(String[] args) {
		ParentClass1 obj = new ParentClass1();
		ParentClass1 obj1 = new ParentClass1(10);
	}

}
