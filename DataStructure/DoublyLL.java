package DataStructure;

public class DoublyLL {
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
		}
	}
	Node head= null;
	Node tail=null;
//	creating addfront function
	public void addNodeFront(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.next = null;
			head.prev=null;
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			newNode.prev=null;
			head = newNode;
		}	
	}
	
	
//	creating addback function
	public void addNodeback(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			tail=newNode;
			head.prev=null;
			tail.next=null;	
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	public void showdata() {
		Node current = head;
		if(head==null) {
			System.out.println("list does't exists");
			return;
		}
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	public static void main(String[] args) {
		DoublyLL d = new DoublyLL();
		d.addNodeFront(5);
		d.addNodeFront(6);
		d.addNodeFront(9);
		d.addNodeback(4);
		d.addNodeback(3);
		
		d.showdata();
		

	}

}
