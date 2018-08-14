package threading;
//Thread is a lightweight sub process or small execution unit
//Multiprocessing and multi threading are ways to achieve multitasking
//Multithreading is running multiple threads simultaneously
//Thread cycles - New, Runnable, Running, Non-runnable(Blocked), Terminated
//Thread is a class
//Thread can be created by extending thread class or implementing runnable interface
//Multithreading saves memory as all threads are allocated same memory space by JVM
//Constructors - Thread(), Thread(String name), Thread(Runnable target), Thread(Runnable target, String name)

public class Example1 extends Thread{
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.start();
	}

}
