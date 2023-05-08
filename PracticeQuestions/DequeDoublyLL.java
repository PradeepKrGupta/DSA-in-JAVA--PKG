package PracticeQuestions;

public class DequeDoublyLL {
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	
	
	static Node front=null;
	static Node rear = null;
	
//	creating addfront and addrear fucntion
	public static void addfront(int data) {
		Node newNode = new Node(data);
		if(front==null) {
			front=rear=newNode;
		}
		else {
			front.prev=newNode;
			newNode.next=front;
			front=newNode;
		}
	
	}
	
	public static void addrear(int data) {
		Node newNode = new Node(data);
		if(front==null) {
			front=rear=newNode;
		}
		else {
			rear.next =newNode;
			newNode.prev=rear;
			rear=newNode;
		}
	}
	
//	creating remove front and remove rear
	public static void removefront() {
		if(front==null) {
			return;
		}
		else if(front==rear) {
			front=rear=null;
		}
		else {
			front = front.next;
			front.prev=null;
		}
		
	}
	
	public static void removerear() {
		if(front==null) {
			return;
		}
		else if(front==rear) {
			front=rear=null;
		}
		else {
			rear=rear.prev;
			rear.next=null;
		}
		
	}
		
//	creatng getfront and getrear
	public static int getfront() {
		if(front==null) {
			return -1;
		}
		return front.data;
	}
	
	public static int getrear() {
		if(front==null) {
			return -1;
		}
		return rear.data;
	}
	
	
		
	

	public static void main(String[] args) {
		DequeDoublyLL d = new DequeDoublyLL();
		d.addrear(5);
		d.addrear(2);
		d.addfront(4);
		d.addfront(8);
		System.out.println(d.getfront());
		System.out.println(d.getrear());
		d.removefront();
		d.removerear();
		System.out.println(d.getfront());
		System.out.println(d.getrear());	

	}

}
