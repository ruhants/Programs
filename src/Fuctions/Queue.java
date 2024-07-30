package Fuctions;

import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {
	
	public static void main(String[] args) {
		java.util.Queue<String> queue = new PriorityQueue<>();
		java.util.Queue<String> queue1 = new PriorityQueue<>();
		
		
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		queue.add("e");
		queue.add("f");
		
		
		
		System.out.println(queue);
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue1.remove());
		System.out.println(queue);
		
		
	}

}
