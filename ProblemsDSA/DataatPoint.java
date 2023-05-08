//Performing all operation of singly linked list;
package ProblemsDSA;

public class DataatPoint {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	int size=0;
	
	
//	creating isempty function to check weather the list is empty or not.
	
	public boolean isempty() {
		return head==null && tail==null;
	}
	
	
	
	
//	creating addfirst, addmiddle , addlast and addindex
	
	public void addfirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			newNode.next = head;
			head=newNode;
		}
		size++;
	}
	
	
	
	
	
	
	public void addmiddle(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			Node currNode = head;
			int mid = (size%2==0)?(size/2):((size+1)/2);
			for(int i=1;i<mid;i++) {
				currNode = currNode.next;
			}
			Node nextNode = currNode.next;
			currNode.next = newNode;
			newNode.next = nextNode;
		}
		size++;
	}
	
	
	
	
	
	public void addlast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			tail.next = newNode;
			tail=newNode;
		}
		size++;
	}
	
	
	
	
	public void addIndex(int idx, int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			Node currNode = head;
			for(int i=1;i<idx-1;i++) {
				currNode= currNode.next;
			}
			Node nextNode = currNode.next;
			currNode.next = nextNode;
			currNode.next = newNode;
			newNode.next = nextNode;
		}
		size++;
	}
	
	
	
	
//	creating deletefirst, deletemiddle , deletelast and deleteindex
	
	public void deletefirst() {
		if(isempty()) {
			return;
		}
		else if(head==tail){
			head=tail=null;
		}
		else {
			head=head.next;
		}
		size--;
	}
	
	
	
	
	
	
	public void deletemiddle() {
		if(isempty()) {
			return;
		}
		else if(head==tail){
			head=tail=null;
		}
		else {
			Node currNode = head;
			int mid = (size%2==0)?(size/2):((size+1)/2);
			for(int i=1;i<mid;i++) {
				currNode=currNode.next;
			}
			Node temp = currNode.next;
			currNode.next = temp.next;
			size--;
		}
		
	}
	
	
	
	
	
	
	public void deletelast() {
		if(isempty()) {
			return;
		}
		else if(head==tail){
			head=tail=null;
		}
		else {
			Node lastNode = head;
			while(lastNode.next.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=null;
		}
		size--;

	}
	
	
	
	
	
	
	
	public void deleteIndex(int idx) {
		if(isempty()) {
			return;
		}
		else if(head==tail){
			head=tail=null;
		}
		else {
			Node currNode = head;
			for(int i=1;i<idx-1;i++) {
				currNode = currNode.next;
			}
			Node nextNode = currNode.next;
			currNode.next = nextNode.next;
		}
		size--;

	}
	
	
//	some other functions like reverse, deleting duplicate , concatinate two linkedlist,etc
	
	
	
//	creating the display function to display the data of the node;
	
	public void display() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.println(currNode.data+" ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		DataatPoint p = new DataatPoint();
		p.addfirst(2);
		p.addfirst(3);
		p.addfirst(5);
		p.addmiddle(8);
		p.addmiddle(9);
		p.addlast(6);
		p.addlast(7);
		p.addIndex(4, 0);
//		p.deletefirst();
//		p.deletemiddle();
//		p.deletemiddle();
//		p.deletelast();
//		p.deleteIndex(3);
//		p.deleteIndex(4);
		p.display();

	}

}
