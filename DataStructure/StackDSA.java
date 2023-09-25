// package DataStructure;
import java.util.*;
import java.io.*;

public class StackDSA {
	//push function 
	public static void stack_push(Stack<Integer> stack) {
		for(int i = 0;i<5;i++) {
			stack.push(i);
		}
	}
	//pop function
	public static void stack_pop(Stack<Integer>stack) {
		System.out.println("Pop operation");
		for(int i=0;i<5;i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}
	//Displaying the top element
	public static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("The top element of the stack is :"+element);
	}

	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);

	}

}
