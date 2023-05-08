package PracticeQuestions;
import java.util.*;
public class LL {
	Node head;
	private static int size;
	LL(){
		this.size=0;
	}
	
	public class Node{
		
		String data;
		Node next;
		public Node(String data) {
			this.data=data;
			this.next = null;
			size++;
		}
	}
		
//		for adding to first>................
		void addFirst(String data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head=newNode;
		}
		
//		for adding to last>.............
		void addLast(String data) {
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
			}
			Node lastNode = head;
			while(lastNode.next!=null) {
				lastNode= lastNode.next;
			}
			lastNode.next = newNode;
		}
		
//		 now to delete first node 
		public void deleteFirst() {
			if(head ==null) {
				System.out.println("list is empty");
				return;
			}
			head = head.next;
			size--;
		}
		
//		now to delete from the last
		public void deletelast() {
			if(head == null) {
				System.out.println("list is empty");
				return;
			}
			size--;
			if(head.next==null) {
				head =null;
				return;
			}
			
			Node secondLast = head;
			Node lastNode = head.next;
			while(lastNode.next!=null) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;
				
			}
			secondLast.next =null;
			
		}
		
//		for printing the data>...............
		public void printdata() {
			Node currNode = head;
			while(currNode!=null) {
				System.out.print(currNode.data+"->");
				currNode = currNode.next;
			}
			System.out.println("NULL");
		}
		
//		creating the getsize funciton
		public static int getSize() {
			return size;
		}
		
	public static void main(String[] args) {
		
		LL list = new LL();
		list.addFirst("is");
		list.addFirst("This");
		list.printdata();
		list.addLast("LinkedList");
		list.printdata();
		list.deleteFirst();
		list.printdata();
		list.deletelast();
		list.printdata();
		System.out.println(getSize());
		list.addFirst("This");
		list.addLast("PKG");
		list.printdata();
		System.out.println(getSize());
	}
	

}
