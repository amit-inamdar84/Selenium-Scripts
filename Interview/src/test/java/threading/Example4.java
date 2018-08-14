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

		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.start();
		obj2.start();
	}

}
