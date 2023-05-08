package DataStructure;
import java.util.*;

class Stack{
//	Declaring the variables and array for stack
	int top=0;
	int maxSize = 10;
	int[] arr = new int[maxSize];
	
	boolean isEmpty() {
		return (top<0);
	}
	public Stack() {
		top = -1;
	}
	
	boolean push(Scanner read) {
		if(top == maxSize-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			System.out.println("Enter value");
			int val = read.nextInt();
			top++;
			arr[top]=val;
			System.out.println("Item Pushed");
			return true;
		}
		
	}
	boolean pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return false;
		}
		else {
			top--;
			System.out.println("Item popped!");
			return true;
		}
	}
	void display() {
		System.out.println("Printing stack elements");
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	
}

public class StwithoutBuiltin {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int choice = 0;
		Stack s = new Stack();
		
		while(choice!=4) {
			System.out.println("chose the following option below");
			System.out.println("Enter 1 for push, 2 for pop, 3 for display and 4 for exit");
			choice = read.nextInt();
			
			switch(choice) {
			case 1:
			{
				s.push(read);
				break;
			}
			case 2:
			{
				s.pop();
				break;
			}
			case 3:
			{
				s.display();
				break;
			}
			case 4:
			{
				System.out.println("Existing...");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Please Enter the valid input");
			}
			}
		};
		
	}

}
