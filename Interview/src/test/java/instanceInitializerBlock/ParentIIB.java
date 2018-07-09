package instanceInitializerBlock;


public class ParentIIB {
	
	ParentIIB() {
		System.out.println("Parent class constructor");
	}
	
	{
		System.out.println("Parent IIB");
	}

}
