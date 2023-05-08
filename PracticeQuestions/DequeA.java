package PracticeQuestions;

public class DequeA {
	static class Deque{
		static int size;
		static int front;
		static int rear;
		static int arr[];
		
		public Deque(int n) {
			front=-1;
			rear=0;
			size=0;
			arr = new int[n];
		}
		
//		creating isempty and isfull funciton
		public static boolean isempty() {
			return size==0;
		}
		
		public static boolean isfull() {
			return size==arr.length;
		}
		
//		creating addfront and addrear function
		public static void addfront(int data) {
			if(isfull()) {
				return;
			}
			if(front==-1) {
				front=0;
				rear=0;
			}
			else if(front==0) {
				front=arr.length-1;
			}
			else {
				front--;
			}
			arr[front]=data;
			size++;
		}
		
		public static void addrear(int data) {
			if(isfull()) {
				return;
			}
			if(front==-1) {
				front=0;
				rear=0;
			}
			else if(rear==arr.length-1) {
				rear=0;
			}
			else {
				rear++;
			}
			arr[rear]=data;
			size++;
		}
		
//		creating removefront and removerear
		public static int removefront() {
			if(isempty()) {
				return -1;
			}
			int result = arr[front];
			if(front==rear) {
				front=rear=-1;
			}
			else if(front==arr.length-1) {
				front=0;
			}
			else {
				front++;
			}
			size--;
			return result;
		}
		
		public static int removerear() {
			if(isempty()) {
				return -1;
			}
			int result = arr[rear];
			if(front==rear) {
				front=rear=-1;
			}
			else if(rear==0) {
				rear=arr.length-1;
			}
			else {
				rear--;
			}
			size--;
			return result;
		}
		
		
//		creating getfront and getrear
		public static int getfront() {
			if(isempty()) {
				return -1;
			}
			return arr[front];
		}
		
		public static int getrear() {
			if(isempty()) {
				return -1;
			}
			return arr[rear];
		}
	}

	public static void main(String[] args) {
		Deque q = new Deque(6);
		q.addrear(5);
		q.addrear(2);
		q.addfront(4);
		q.addfront(8);
//		System.out.println(q.getfront());
//		System.out.println(q.getrear());
//		System.out.println(q.removefront());
//		System.out.println(q.removerear());
//		System.out.println(q.getfront());
//		System.out.println(q.getrear());

		
		while(!q.isempty()) {
			System.out.println(q.getrear());
			q.removerear();
		}

	}

}
