package threading;

public class Example6 extends Thread{
	public void run(){
		System.out.println("Thread started");
	}
	
	public static void main(String[] args) {
		Example6 obj = new Example6();
		Example6 obj1 = new Example6();
		
		System.out.println("Name of first thread: "+obj.getName());
		System.out.println("Name of second thread: "+obj1.getName());
		System.out.println("ID of second thread: "+obj1.getId());
		
		obj.start();
		obj1.start();
		
		obj.setName("Test1");
		System.out.println("Name of first thread: "+obj.getName());
	}

}
