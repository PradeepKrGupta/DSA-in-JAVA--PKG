//Insert data on two stack and addthem and insert the sum into linkedlist and display it.
package ProblemsDSA;
import java.util.*;


class Stack{
    int size;
    int[] arr;
    int top;
    Stack(int size){
        this.size=size;
        arr = new int[size];
        top=-1;
    }
    
    public boolean isempty(){
        return (top<0)?true:false;
    }
    
    public boolean isfull(){
        return (top==size-1)?true:false;
    }
    
    public void push(int data){
        if(isfull()){
            System.out.println("overflow");
            return;
        }
        else{
            arr[++top] = data;
            System.out.println("pushed");
            return;
        }
        
    }
    
    public int pop(){
        if(isempty()){
            System.out.println("underflow");
            return -1;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}


class Linkedlist{
	Node head;
	Node tail;
	Node next;
	public Linkedlist() {
		this.head=null;
		this.tail=null;
		this.next=null;
	}
	
	public void insertfront(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			tail=head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void removeItem() {
		if(head==null) {
			System.out.println("nothing to print");
			return;
		}
		else if(head==tail) {
			head=tail=null;
		}
		Node lastNode = head;
		while(lastNode.next.next!=null){
			lastNode=lastNode.next;
		}
		lastNode.next=null;
	}
	
	public void printlist() {
		if(head==null) {
			System.out.println("Nothing to println");
			return;
		}
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
    
public class StackLinkedListProblem{  
	
	public static void main(String[] args) {
		Stack s1 = new Stack(3);
		Stack s2 = new Stack(3);
		Linkedlist list = new Linkedlist();
		s1.push(20);
		s1.push(10);
		s1.push(20);
		
		s2.push(20);
		s2.push(5);
		s2.push(20);
		
		list.insertfront(s1.pop()+s2.pop());
		list.insertfront(s1.pop()+s2.pop());
		list.insertfront(s1.pop()+s2.pop());
		
		list.printlist();
	}
}






