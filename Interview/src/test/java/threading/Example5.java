package threading;
//join(long milliseconds) - This method will wait for the execution of current thread for specified time. After the specified time, next threads waiting will
//start executing. i.e. all threads will execute concurrently after the specified time.

public class Example5 extends Thread{

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
		Example5 obj = new Example5();
		Example5 obj1 = new Example5();
		Example5 obj2 = new Example5();

		obj.start();
		try {
			obj.join(15000);//Here after 15 seconds all threads will execute simultaneously
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.start();
		obj2.start();
	}



}
