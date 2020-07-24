package threading;
//Deadlock is a part of multi-threading.
//It can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock,
//that is acquired by first thread.

public class Deadlock {
	String s1 = "Test1";
	String s2 = "Test2";

	// Below is anonymous inner class.
	Thread t1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s1) {// This block will lock the object for a
									// thread t1.
					System.out.println(Thread.currentThread().getName() + " locked " + s1);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					// When t1 is ready to lock s2 below it is already locked by
					// t2.
					// So t1 waits for t2 to release the lock.
					synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + " locked " + s2);
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s2) {// This block will lock the object for a
									// thread t2.
					System.out.println(Thread.currentThread().getName() + " locked " + s2);
					// When t2 is ready to lock s1 below it is already locked by
					// t1. So t2 waits for t1 to release the lock.
					synchronized (s1) {
						System.out.println(Thread.currentThread().getName() + " locked " + s1);
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		Deadlock obj = new Deadlock();
		// This is how we call methods on anonymous inner class.
		// Both these threads start simultaneously.
		obj.t1.start();
		obj.t2.start();
	}

}
