package collectionsFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueInJava1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		//queue.add("test1");
		//queue.add("test2");
		//queue.add("test3");
		//queue.add("test4");
		//queue.add("test5");
		
		//System.out.println("Head: " +queue.element());
/*		System.out.println("Head: " +queue.peek());
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//queue.remove();
		queue.poll();
		
		Iterator itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
