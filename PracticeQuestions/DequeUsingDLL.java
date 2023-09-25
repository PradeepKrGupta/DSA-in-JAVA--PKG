// package PracticeQuestions;

public class DequeUsingDLL {
	static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
		}
	}
	static Node front = null;
	static Node rear = null;
	static int size = 0;
//	creating addfront function
	public static void addfront(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front=rear= newNode;
		}
		else {
			newNode.next=front;
			front.prev=newNode;
			front = newNode;
		}
		size++;
		 
	}
	
//	creating addrear function
	public static void addrear(int data) {
		Node newNode = new Node(data);
		if(front==null) {
			front=rear=newNode;
		}
		else {
			newNode.prev=rear;
			rear.next =newNode;
			rear = newNode;
		}
		size++;
	}
	
//	creating the removefront funciton
	public static void removefront() {
		if(front==null) {
			System.out.println("No list is available");
			return;
		}
		else if(front==rear) {
			front=rear=null;
		}
		else {
			front=front.next;
			front.prev=null;
		}
		size--;
	}
	
//	creating the removerear function
	public static void removerear() {
		if(front==null) {
			System.out.println("No list is availble");
			return;
		}
		else if(front == rear) {
			front=rear=null;
		}
		else {
			rear = rear.prev;
			rear.next = null;
		}
		size--;
	}
//	creating getfront and getrear function
	public static int getfront() {
		if(front==null) {
			System.out.println("Not Available");
			return -1;
		}
		return front.data;
	}
	public static int getrear() {
		if(front==null) {
			System.out.println("Not availble");
			return -1;
		}
		return rear.data;
	}
//	creating getsize function
	public static int getsize() {
		return size;
	}
	
	

	public static void main(String[] args) {
		DequeUsingDLL d = new DequeUsingDLL();
		d.addfront(2);
		d.addfront(6);
		d.addfront(4);
		System.out.println(d.getfront());
		System.out.println(d.getrear());
		System.out.println(d.getsize());
		d.addrear(9);
		d.addrear(3);
		System.out.println(d.getrear());
	}

}
