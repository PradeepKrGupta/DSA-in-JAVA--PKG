package ProblemsDSA;

public class QueueArray {
	static class Queue{
		static int rear;
		static int size;
		static int arr[];
		
		public Queue(int size) {
			this.size = size;
			arr = new int[size];
			rear=-1;
		}
		
//		creating the isempty function
		public static boolean isempty() {
			return rear==-1;
		}
		
//		creating a add function
		public static void add(int data) {
			if(rear==size-1) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear]=data;
		}
		
//		creating remove function
		public static int remove() {
			if(isempty()) {
				System.out.println("Queue underflow");
				return -1;
			}
			int front = arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		
//		creating peek operation
		public static int peek() {
			if(isempty()) {
				System.out.println("Queue underflow");
				return -1;
			}
			return arr[0];
		}
		
	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(2);
		System.out.println(q.remove()+ " is removed");
		System.out.println(q.peek()+" is on top");
		while(!q.isempty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
