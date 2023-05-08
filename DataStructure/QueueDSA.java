package DataStructure;
import java.util.*;
import java.io.*;

public class QueueDSA {
	static class Queue{
		static int size;
		static int rear;
		static int arr[];
		
		public Queue(int size) {
			this.size = size;
			arr = new int[size];
			rear = -1;
			
		}
		
		
		//isEmpty function
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		//isfull function
		
		public static boolean isFull() {
			return rear == size-1;
		}
		
		//Enqueue of data or element in queue
		
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Overflow");
				return;
			}
			arr[++rear]=data;
		}
		
		//Dequeue of data or element in queue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Underflow");
				return -1;
			}
			int front = arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
			
			
		}
		
		//To show the peek or first element;
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
			q.add(1);
			q.add(2);
			q.add(3);
			while(!q.isEmpty()) {
				System.out.println(q.peek());
				q.remove();
			}

	}

}
