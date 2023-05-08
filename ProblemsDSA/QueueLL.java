package ProblemsDSA;
import java.util.*;

public class QueueLL {
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	static class Queue{
		static Node head = null;
		static Node tail = null;
		
//		creating isempty funciton
		public static boolean isempty() {
			return head==null && tail==null;
		}
		
//		creating add and remove funciton
		public static void add(int data) {
			Node newNode = new Node(data);
			if(isempty()) {
				tail=head=newNode;
			}
			tail.next = newNode;
			tail=newNode;
		}
		
//		creating remove function
		public static int remove() {
			if(isempty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			
			if(head==tail) {
				tail=null;
			}
			int front = head.data;
			head=head.next;
			return front;
		}
		
//		creating peek function
		public static int peek() {
			if(isempty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
	
		}
	
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(5);
		q.add(6);
		q.add(7);
		System.out.println(q.remove()+" is removed");
		System.out.println(q.peek()+" is on top");
		
		while(!q.isempty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}
}


