package threading;
//currentThread() - Returns reference to the currently executing thread object.
//Thread priority - Each thread has a priority. Value is between 1 and 10. Thread scheduler schedules the threads according to their priority know as
//preemptive scheduling.
//Thread class constant - public static int MIN_PRIORITY, public static int NORM_PRIORITY, public static int MAX_PRIORITY
//Default priority of a thread is 5(NORM_PRIORITY). Value of MIN_PRIORITY is 1 and value of MAX_PRIORITY is 10.
//After setting priority, the output will be in same order.

public class Example7 extends Thread{
	public void run(){
		System.out.println("Thread started");
		//In below method call Thread.currentThread() which is a static method returns reference to current thread object. Ex:obj. Using this reference we can
		//call non-static method .getName(). Ex: obj(Thread.currentThread()).getName()
		System.out.println("Watch this: "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Example7 obj = new Example7();
		obj.setPriority(MIN_PRIORITY);
		obj.start();
		
		Example7 obj1 = new Example7();
		obj1.setPriority(MAX_PRIORITY);
		obj1.start();
		
		Example7 obj2 = new Example7();
		obj2.start();
	}

}
