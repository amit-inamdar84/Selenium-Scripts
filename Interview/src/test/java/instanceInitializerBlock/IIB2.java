package instanceInitializerBlock;

public class IIB2 {
	int a[];
    
	//Below is IIB block
	{
		a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}
	}

	void display() {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		IIB2 obj = new IIB2();
		obj.display();

	}

}
