// package PracticeQuestions;

public class CircluarQLL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	static class CQ{
		static Node front=null;
		static Node rear=null;
		
		public static boolean isempty() {
			return front==null && rear==null;
		}
		
		public static void add(int data) {
			Node newNode = new Node(data);
			if(isempty()) {
				front=rear=newNode;
			}
			else {
				rear.next=newNode;
				rear=newNode;
			}
			rear.next=front;	
		}
		
		public static int remove() {
			if(isempty()) {
				return -1;
			}
			int result = front.data;
			if(front==rear) {
				front=rear=null;
			}
			else {
				front=front.next;
				rear.next=front;
				
			}
			return result;
		}
		
		public static int peek() {
			if(isempty()) {
				return -1;
			}
			return front.data;
		}
		
	}
	
	public static void main(String[] args) {
		CQ q = new CQ();
		q.add(5);
		q.add(6);
		q.add(7);
		while(!q.isempty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
