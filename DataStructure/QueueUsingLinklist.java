// package DataStructure;

import java.util.*;

public class QueueUsingLinklist {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
		 this.data = data;
		 next = null;
	}
	}
		
	static class Queue{
		static Node head=null;
		static Node tail=null;
		
//			Now creating the isempty function 
		public static boolean isEmpty() {
			return head==null && tail==null;
			
		}
//			creating the add function
		public static void add(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head=tail=newNode;
			}
			else {
				tail.next=newNode;
				tail = newNode;
				
			}
		}
		
//			Now creating the remove function
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front = head.data;
//				for single node
			if(head==tail) {
				tail=null;
			}
			head = head.next;
			return front;
		}
//			for peek function
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
		
			}	
		}	
	

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(4);
		q.add(5);
		q.add(6);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
