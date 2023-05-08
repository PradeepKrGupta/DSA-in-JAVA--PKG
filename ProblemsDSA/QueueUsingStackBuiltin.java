package ProblemsDSA;
import java.util.*;


public class QueueUsingStackBuiltin {
	static class Queue{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();
		
		static void enQueue(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			s1.push(data);
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			
		}
		
		static int deQueue() {
			if(s1.isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int x = s1.peek();
			s1.pop();
			return x;
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

		System.out.println(q.deQueue());


	}

}
