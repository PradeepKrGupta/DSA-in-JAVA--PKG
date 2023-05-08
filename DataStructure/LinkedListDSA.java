package DataStructure;
import java.util.*;
import java.io.*;

public class LinkedListDSA {
	Node head;
	static int size;
	LinkedListDSA(){
		size= 0;
	}
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data= data;
			this.next= null;
			size++;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node lastnode = head;
		while(lastnode.next !=null) {
			lastnode = lastnode.next;
		}
		lastnode.next = newNode;
	}
	
	public void removeFirst() {
		if(head == null) {
			System.out.println("linked list is empty, nothing to delete");
			return;
		}
		this.head = head.next;	
		size--;
	}
	
	public void printlist() {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	
	
	
	public static void main(String[]args) {
		LinkedListDSA list = new LinkedListDSA();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addFirst(0);
		list.printlist();
		list.removeFirst();
		list.printlist();
		System.out.println("The size of linked list is :"+size);
	}

}
