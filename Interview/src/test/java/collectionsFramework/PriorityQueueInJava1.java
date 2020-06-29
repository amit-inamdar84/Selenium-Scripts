package collectionsFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
//This program will demonstrate the output of various methods when queue is empty.
public class PriorityQueueInJava1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		//queue.add("test1");
		//queue.add("test2");
		//queue.add("test3");
		//queue.add("test4");
		//queue.add("test5");
		
		//System.out.println("Head: " +queue.element());
		System.out.println("Head: " +queue.peek());
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//queue.remove();
		System.out.println(queue.poll());
		
		Iterator itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Queue<String> queue1 = new PriorityQueue<String>();
		queue1.add("A");
		queue1.add("B");
		queue1.add("C");
		queue1.add("D");
		queue1.add("E");
		
		System.out.println(queue1);
		System.out.println(queue1.offer("F"));
		
		Iterator itr2 = queue1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
