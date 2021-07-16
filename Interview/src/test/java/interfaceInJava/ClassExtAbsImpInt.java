package interfaceInJava;
//Example of class extending abstract class and implementing interface.

public class ClassExtAbsImpInt extends AbsTest implements IntA{

	@Override
	public void present() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ClassExtAbsImpInt obj = new ClassExtAbsImpInt();
		obj.present();
	}

}
