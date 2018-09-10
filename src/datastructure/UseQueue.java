package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("TOYOTA");
		queue.add("HONDA");
		queue.add("Jeep");
		queue.add("Tesla");
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.remove("TOYOTA"));
		System.out.println(queue.poll());

		Iterator car = queue.iterator();
		while (car.hasNext()) {
			System.out.println(car.next());
		}
		for (String st : queue) {
			System.out.println(st);
		}

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());


		}
	}
}
