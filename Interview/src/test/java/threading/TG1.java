package threading;
//Thread group provides a convenient way to group multiple threads in a single object.
//Constructors of ThreadGroup class - ThreadGroup(String name), ThreadGroup(ThreadGroup parent, String name)
//Methods - int activeCount() - returns no of threads running in current group, int activeGroupCount() - returns no of active group in this thread group.

public class TG1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method output: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//Create an object of this class which is of type runnable.
		TG1 runnable = new TG1();
		//Create an object of ThreadGroup class with name as constructor argument.
		ThreadGroup tg = new ThreadGroup("Parent thread group");
		
		//Then create a thread class object and using its constructor group the thread into a thread group with name "XYZ".
		Thread t1 = new Thread(tg,runnable,"one");
		t1.start();
		
		Thread t2 = new Thread(tg,runnable,"two");
		t2.start();
		
		Thread t3 = new Thread(tg,runnable,"three");
		t3.start();
		
		System.out.println("Thread group name: "+tg.getName());
		tg.list();
		System.out.println("Active count: "+tg.activeCount());
		
	}
	

}
