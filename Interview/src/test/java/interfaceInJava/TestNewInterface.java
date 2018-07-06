package interfaceInJava;

public class TestNewInterface implements NewInterface {

	public static void main(String[] args) {
		TestNewInterface obj = new TestNewInterface();
		//Calling default interface method using object reference
		System.out.println(obj.xyz());
		//Calling static interface method using interface name-Saves memory
		int sum = NewInterface.add(10, 30);
		System.out.println(sum);

	}

	@Override
	public void abc() {

	}

}
