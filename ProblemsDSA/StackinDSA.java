package ProblemsDSA;
import java.util.*;

public class StackinDSA {
	int arr[];
	int top;
	int size;
	public StackinDSA(int size) {
		this.size= size;
		arr = new int[size];
		top = -1;
	}
	
//	creating isempty and isfull function
	public boolean isempty() {
		return (top<0);
	}
	
	public boolean isfull() {
		return (top==size-1);
	}
	
//	creating a push operation
	public void push(int data) {
		if(isfull()) {
			return;
		}
		else {
			arr[++top]=data;
			System.out.println(data+" is pushed");
			
		}
	}
	
//	creating a pop operation
	public int pop() {
		if(isempty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			int x = arr[top--];
			return x;
		}
	}
	
//	creating a peek operation
	public int peek() {
		if(isempty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			int x = arr[top];
			return x;
		}
	}
	
//	printing the stack
	public void printstack() {
		if(isempty()) {
			System.out.println("Stack is underflow");
			return;
		}
		for(int i=top;i>-1;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the stack");
		size=read.nextInt();
		StackinDSA s = new StackinDSA(size);
		
		s.push(5);
		s.push(6);
		s.push(7);
		System.out.println(s.pop()+" is poped");
		System.out.println(s.peek()+" is on top");
		s.printstack();
		 
	}

}
