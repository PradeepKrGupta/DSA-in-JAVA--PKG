package DataStructure;
import java.util.*;
import java.lang.*;

public class DoubleEndedQueue {

	static class Deque {
	    static int[] elements;
	    static int front;
	    static int rear;
	    static int size;

	    public Deque(int capacity) {
	        elements = new int[capacity];
	        front = -1;
	        rear = 0;
	        size = 0;
	    }

	    public static boolean isEmpty() {
	        return size == 0;
	    }

	    public static boolean isFull() {
	        return size == elements.length;
	    }

	    public static int size() {
	        return size;
	    }

	    public static void addFront(int element) {
	        if (isFull()) {
	            System.out.println("Deque is full");
	        }
	        if (front == -1) {
	            front = 0;
	            rear = 0;
	        } else if (front == 0) {
	            front = elements.length - 1;
	        } else {
	            front--;
	        }
	        elements[front] = element;
	        size++;
	    }

	    public static void addRear(int element) {
	        if (isFull()) {
	            System.out.println("Deque is full");
	        }
	        if (front == -1) {
	            front = 0;
	            rear = 0;
	        } else if (rear == elements.length - 1) {
	            rear = 0;
	        } else {
	            rear++;
	        }
	        elements[rear] = element;
	        size++;
	    }

	    public static int removeFront() {
	        if (isEmpty()) {
	            System.out.println("Deque is empty");
	        }
	        int element = elements[front];
	        if (front == rear) {
	            front = -1;
	            rear = -1;
	        } else if (front == elements.length - 1) {
	            front = 0;
	        } else {
	            front++;
	        }
	        size--;
	        return element;
	    }

	    public static int removeRear() {
	        if (isEmpty()) {
	            System.out.println("Deque is empty");
	        }
	        int element = elements[rear];
	        if (front == rear) {
	            front = -1;
	            rear = -1;
	        } else if (rear == 0) {
	            rear = elements.length - 1;
	        } else {
	            rear--;
	        }
	        size--;
	        return element;
	    }

	    public static int peekFront() {
	        if (isEmpty()) {
	            System.out.println("Deque is empty");
	        }
	        return elements[front];
	    }

	    public static int peekRear() {
	        if (isEmpty()) {
	            System.out.println("Deque is empty");
	        }
	        return elements[rear];
	    }
	}


	    public static void main(String[]args){
	        Deque q = new Deque(5);
	        q.addFront(5);
	        q.addFront(6);
	        q.addRear(2);
	        q.addFront(7);
	     
	        
	        while(!q.isEmpty()){
	            System.out.println(q.peekFront());
	            q.removeFront();
//	            q.removeRear();
	        }
	    }
}