package threading;
//wait() - This method causes current thread to release the lock and wait until either another thread invokes notify() method or notifyAll() method for this
//object, or a specified amount of time has elapsed.
//notify() - Wakes up a single thread that is waiting on this object's monitor.
//notifyAll() - Wakes up all threads that are waiting on this object's monitor.
//Synchronized method is used to lock an object for any shared resource. When a thread invokes a synchronized method, it automatically acquires the lock for that
//object and releases it when the thread completes its task.

public class InterThreadCommunication {
	int amount = 10000;
	
	synchronized void withdraw(int amount){
		System.out.println("Withdrawal started...");
		
		if(this.amount<amount){
			System.out.println("Less balance waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("Withdrawal completed");
	}
	
	synchronized void deposit(int amount){
		System.out.println("Going to deposit....");
		this.amount=this.amount+amount;
		System.out.println("Deposit completed");
		notify();
	}

}
