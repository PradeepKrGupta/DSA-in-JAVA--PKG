//Delete the repeated node from doubly linked list and reverse it.
package ProblemsDSA;
import java.util.*;
public class DoublyLinkedList{
	class Node{
		Node next;
		Node prev;
		int data;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	int size=0;
			
	//	creating isempty function;
		public boolean isempty() {
			return head==null && tail==null;
		}
		
	
	//	creating addfirst and addlast function;
		public void addfirst(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=tail=newNode;
			}
			else {
				newNode.next=head;
				head.prev = newNode;
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
				Node curNode = head;
				Node temp= null;
				int mid = (size%2==0)?(size/2):((size+1)/2);
				
				for(int i=1; i<mid;i++) {
					curNode = curNode.next;
				}
				temp = curNode.next;
				temp.prev=curNode;
				
				curNode.next=newNode;
				newNode.prev = curNode;
				newNode.next=temp;
				temp.prev = newNode;
			}
			size++;
			
		}
		
		public void addlast(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=tail=newNode;
			}
			else {
				tail.next=newNode;
				newNode.prev=tail;
				tail=newNode;
			}
			size++;
		}
		
	//	creating delete first and delete last 
		
		public void deletefirst() {
			if(isempty()) {
				System.out.println("list not exits");
				return;
			}
			else if(head==tail) {
				head=tail=null;
			}
			else {
				head=head.next;
				head.prev=null;
			}
			size--;
		}
		
		public void deletemiddle() {
			if(isempty()) {
				System.out.println("list not exits");
				return;
			}
			else if(head==tail) {
				head=tail=null;
			}
			else {
				Node currNode = head;
				int mid = (size%2==0)? (size/2):((size+1)/2);
				for(int i=1;i<mid;i++) {
					currNode = currNode.next;
				}
				if(currNode==head) {
					head=currNode.next;
				}
				else if(currNode==tail) {
					tail=tail.prev;
				}
				else {
					currNode.prev.next=currNode.next;
					currNode.next.prev=currNode.prev;
				}
				currNode=null;
			}
			
			size--;
		}
		
		
		public void deletelast() {
			if(isempty()) {
				System.out.println("list not exits");
				return;
			}
			else if(head==tail) {
				head=tail=null;
			}
			else {
				tail=tail.prev;
				tail.next=null;
			}
			size--;
		}
		
	//	creating display function
		public void display() {
			if(isempty()) {
				System.out.println("Nothing to print");
				return;
			}
			Node currNode = head;
			while(currNode!=null) {
				System.out.println(currNode.data+" ");
				currNode=currNode.next;
			}
		}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addfirst(1);
		list.addfirst(2);
		list.addlast(5);
		list.addlast(4);
		list.addmiddle(8);
		list.addmiddle(9);
		list.deletefirst();
		list.deletelast();
		list.deletemiddle();
		list.display();
	}
}