package PracticeQuestions;

public class CircularQArray {
	static class CQ{
		static int size;
		static int front=-1;
		static int rear=-1;
		static int arr[];
		
		public CQ(int size) {
			this.size=size;
			arr= new int[size];
		}
		
//	 creating the isempty and isfull funciton
		public static boolean isempty() {
			return front==-1 && rear==-1;
		}
		
		public static boolean isfull() {
			return (rear+1)%size==front;
		}
		
//		creting add function
		public static void add(int data) {
			if(isfull()) {
				System.out.println("full");
				return;
			}
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
//		creating remove function
		public static int remove() {
			if(isempty()) {
				return -1;
			}
			int result = arr[front];
			if(front==rear) {
				rear=front=-1;
			}
			else {
				front=(front+1)%size;
			}
			return front;
		}
		
//		creatiing peek
		public static int peek(){
			if(isempty()) {
				return -1;
			}
			return arr[front];

		}
	}

	public static void main(String[] args) {
		CQ q = new CQ(5);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(9);
		while(!q.isempty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
