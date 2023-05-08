package DataStructure;

public class CircularQueueUsingArray {
	static class CircularQueue{
//		initializing the front, rear , size and array
		static int rear=-1;
		static int front = -1;
		static int arr[];
		static int size;
		
		public CircularQueue(int n) {
			this.size= n;
			arr = new int[size];
			
		}
//		Creating the is empty function to check weather the queue is empty or not
		public static boolean isEmpty() {
			return front==-1 && rear==-1;
			
		}
//		Creating the is full function to check the queue is full or not
		public static boolean isfull(){
			return (rear+1)%size==front;
		}
		
//		creating the enqueue operation to add the element in the queue
		public static void add(int data) {
			if(isfull()) {
				System.out.println("Queue is full");
				return;
			}
//			Since we are increasing the rear from -1 to 0 so we also have to increase the front - 1 to 0.
			if(front==-1) {
				front=0;
			}
			
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
//		Creating the remove function
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int result = arr[front];
			if(front ==rear) {
				rear = front= -1;
				
			}
//			if there is an single element inside the array
			else {
				front=(front+1)%size;
			}
			return result;
			
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
			
		}
		
		
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		System.out.println(q.remove());
		q.add(3);
		System.out.println(q.remove());
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
		

	}

}
