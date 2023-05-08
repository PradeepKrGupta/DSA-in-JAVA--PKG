package ProblemsDSA;

public class DeletingDuplicateLL {
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	Node head = null;
	Node tail=null;
	
	int size = 0;
	
	
	
//	creating isempty function to check weather the list is empty or not.
	
	public boolean isempty() {
		return head==null && tail==null;
	}
	
	
	
	
//	creating addfirst and addlast function to insert the data from first and last.
	
	public void addfirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head=newNode;
		}
		size++;
	}
	
	
	
	
	
	public void addlast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
		}
		else {
			newNode.prev =tail;
			tail.next = newNode;
			tail=newNode;
		}
		size++;
	}
	
	
	
//	creating deletefirst and deletelast function to delete the node from the first and last
	
	public void deletefirst() {
		if(isempty()) {
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
	
	
	
	
	
	public void deletelast() {
		if(isempty()) {
			return;
		}
		else if(head==tail) {
			head=tail=null;
		}
		
		else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
		
	}
	
	
	
//	creating the display function to display the data of the node;
	
	public void display() {
		if(head==null) {
			return;
		}
		else {
			Node currNode = head;
			while(currNode!=null) {
				System.out.print(currNode.data+" ");
				currNode=currNode.next;
			}
		}
		System.out.println();
	}

	
	
//	creating deleteduplicate function to delete the duplicate elements from the list
	
	public void deleteDuplicate() {
		if(isempty()) {
			System.out.println("underflow");
			return;
		}
		else if(head==tail) {
			System.out.println(head.data);
		}
		else {
			Node currNode, temp, index;
			for(currNode=head;currNode!=null;currNode=currNode.next) {
				for(index=currNode.next;index!=null;index=index.next) {
					if(currNode.data==index.data) {
//						store the index into temp
						temp=index;
						
						index.prev.next = index.next;
						if(index.next!=null) {
							index.next.prev=index.prev;
						}
						temp=null;
					}
				}
			}
			
		}
	}
	
	
	
	
//	creating the reverse function to reverse the duplicate delete result list in reverse order.
	
	public void reverse() {
		if(isempty()) {
			return;
		}
		else if(head==tail) {
			System.out.println(head.data);
		}
		else {
			Node lastNode = head;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			Node FN = lastNode;
			while(FN.prev!=null) {
				System.out.print(FN.data+ " ");
				FN = FN.prev;
			}
			System.out.print(FN.data+" ");
		}
		
	}
	

	

	public static void main(String[] args) {
		DeletingDuplicateLL list = new DeletingDuplicateLL();
		list.addfirst(1);
		list.addfirst(2);
		list.addfirst(4);
		list.addfirst(5);
		list.addfirst(4);
		list.addfirst(2);
		list.addfirst(7);
		list.addfirst(1);
		System.out.println("List before deleting duplicates");
		list.display();
		list.deleteDuplicate();
		System.out.println("list after deleting duplicates");
		list.display();
		System.out.println("List after reverse");
		list.reverse();

	}

}
