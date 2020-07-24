package threading;

public class ThreadNotes {
	
	//Thread is a lightweight sub process or small execution unit.
	//Multitasking is done to utilize CPU.
	//Multiprocessing and multithreading are ways to achieve multitasking
	//Multithreading is running multiple threads simultaneously
	//Threads are independent of each other which means if exceptions occurs in one thread it will not impact another thread.
	//Thread cycles - New, Runnable, Running, Non-runnable(Blocked), Terminated
	//Thread is a class
	//Thread can be created by extending thread class or implementing runnable interface
	//Multithreading saves memory as all threads are allocated same memory space by JVM
	//Constructors - Thread(), Thread(String name), Thread(Runnable target), Thread(Runnable target, String name), Thread(ThreadGroup group, Runnable target, String name) {
	//Difference between Multiprocessing and multithreading:
	//1. Multiprocessing is heavyweight process while multithreading is light weight process.
	//2. Separate memory area is allocated for each process in multiprocessing while in multithreading all threads are allocated the same memory space by JVM.
	//3. Switching from one process to another requires some time. Switching from one thread to another is easy.
	//New: The thread is in new state if you create an instance of thread class but before invocation of start() method.
	//Runnable: A thread is in runnable state after invocation of start() method, but before the thread scheduler has not selected it to be running thread.
	//Running: Thread is running if scheduler has selected it to run.
	//Non-runnable(Blocked): This is the state when thread is still alive, but is currently not eligible to run.
	//Terminated : A thread is in terminated state when its run() method exits.

}
