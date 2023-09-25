// package DataStructure;

public class QueueUsingArray {
	static class Queue{
		static int rear = -1;
		static int size;
		static int arr[];
		public Queue(int n) {
			this.size = n;
			arr = new int[size];
			
		}
		public static boolean isEmpty() {
			return rear==- 1;
		}
		
//		Now for Enqueue operation 
		public static void add(int data){
			if(rear == size-1) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear]=data;
		}
		
//		Now for removing the data from the queue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front=arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
				
			}
			rear--;
			return front;
		}
//		for peek operation 
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[0];
		}
		
	}
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(5);
		q.add(6);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		

	}

}
