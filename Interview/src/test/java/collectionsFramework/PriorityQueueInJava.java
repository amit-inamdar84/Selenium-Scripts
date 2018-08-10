package collectionsFramework;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue is an interface
//FIFO - First element is removed first and last element is removed last
//

public class PriorityQueueInJava {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("test1");
		queue.add("test2");
		queue.add("test3");
		queue.add("test4");
		queue.add("test5");
		//queue.element() Retrieves, but does not remove, the head of this queue. 
		//This method differs from peek only in that it throws an exception(java.util.NoSuchElementException) if this queue is empty.
		System.out.println("Head: " +queue.element());
		//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("Head: " +queue.peek());
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Retrieves and removes the head of this queue
		//Throws java.util.NoSuchElementException if queue is empty
		queue.remove();
		//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		queue.poll();
		
		Iterator itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
