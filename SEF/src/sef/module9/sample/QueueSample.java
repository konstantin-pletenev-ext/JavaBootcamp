package sef.module9.sample;
// Complete Code
import java.util.*;

public class QueueSample {
	/**
	 * Example method for using a Queue
	 */
	public void queueExample() {

		Queue queue = new LinkedList();

		// Using the add method to add items.
		// Should anything go wrong an exception will be thrown.
		queue.add("item1");
		queue.add("item2");

		// Using the offer method to add items.
		// Should anything go wrong it will just return false
		queue.offer("Item3");
		queue.offer("Item4");

		// Removing the first item from the queue.
		// If the queue is empty a java.util.NoSuchElementException will be
		// thrown.
		System.out.println("remove: " + queue.remove());

		// Removing the first item from the queue.
		// If the queue is empty the method just returns false.
		System.out.println("poll: " + queue.poll());

		// Checking what item is first in line without removing it
		// If the queue is empty a java.util.NoSuchElementException will be
		// thrown.
		System.out.println("element: " + queue.element());

		// Checking what item is first in line without removing it
		// If the queue is empty a null value will be returned.
		System.out.println("peek: " + queue.peek());

	}

	public static void main(String[] args) {
		new QueueSample().queueExample();
	}

}
