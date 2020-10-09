package instanceInitializerBlock;

public class IIB3 {
	static int i;
	static int j;
	
	{
		i = 10;
	}
	
	static {
		j = 20;
	}
	
	static {
		System.out.println("Static block execution without object");
		System.out.println(j);
	}

	public static void main(String[] args) {
		IIB3 obj = new IIB3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		IIB3 obj1 = new IIB3();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
	}

}
