package threading;

public class TestThreadComm {

	public static void main(String[] args) {
		InterThreadCommunication c = new InterThreadCommunication();

		Thread t1 = new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};
		t2.start();
	}

}
