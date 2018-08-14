package threading;
//Thread scheduler is a part of JVM that decides which thread will run
//We cannot start a thread twice. If tried we receive IllegalThreadStateException

public class Example3 extends Thread{
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String[] args) {
		Example3 obj = new Example3();
		obj.start();
		//obj.start(); java.lang.IllegalThreadStateException
	}

}
