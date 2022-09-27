package beginner;

import java.util.Collections;
//import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesDemo {

	public static void main(String[] args) {
		
		// FIRST IN FIRST OUT
//		Queue<String> queue = new LinkedList<String>();
//		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
//		System.out.println(queue.isEmpty());
		
		queue.offer("d");
		queue.offer("a");
		queue.offer("b");
		queue.offer("e");
		queue.offer("c");
		
//		queue.offer(3.0);
//		queue.offer(2.5);
//		queue.offer(4.0);
//		queue.offer(1.5);
//		queue.offer(2.0);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.size());
//		System.out.println(queue.contains("a"));
//		System.out.println(queue);
	}
}
