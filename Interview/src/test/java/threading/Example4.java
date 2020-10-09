package threading;
//Join method will wait to complete execution of current thread

public class Example4 extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Example4 obj = new Example4();
		Example4 obj1 = new Example4();
		Example4 obj2 = new Example4();

		obj.start();//Thread 1 will complete first as we have join method after it.
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Once thread 1 is complete, thread 2 and 3 will execute simultaneously.
		obj1.start();
		obj2.start();
	}

}
