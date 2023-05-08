package PracticeQuestions;

public class DoubleEndedQueue {

	 static class Deque{
	        static int arr[];
	        static int size;
	        static int front;
	        static int rear;
	        
	        public Deque(int n){
	            arr=new int[n];
	            size =0;
	            front=-1;
	            rear=0;
	        }
	        
	        // creating isfull and isempty and size functions
	        public static boolean isempty(){
	            return size==0;
	        }
	        
	        public static boolean isfull(){
	            return size==arr.length;
	        }
	        
	        public static int size(){
	            return size;
	        }
	        
	        // creating addfront function;
	        public static void addfront(int data){
	            if(isfull()){
	                System.out.println("overflow");
	                return;
	            }
	            
	            if(front==-1){
	                front=0;
	                rear = 0;
	            }
	            else if(front==0){
	                front=arr.length-1;
	            }
	            else{
	                front--;
	            }
	            arr[front]=data;
	            size++;
	        }
	        
	        // creating addRear function
	        public static void addrear(int data){
	            if(isfull()){
	                System.out.println("overflow");
	                return;
	            }
	            else if(front == -1){
	                front=0;
	                rear=0;
	            }
	            else{
	                rear++;
	            }
	            arr[rear]=data;
	            size++;
	        }
	        
	        // creating removefront function
	        public static int removefront(){
	            if(isempty()){
	                System.out.println("underflow");
	                return -1;
	            }
	            int data = arr[front];
	            if(front==rear){
	                 front=- 1;
	                 rear=-1;
	            }
	            else if(front ==arr.length-1){
	                front = 0;
	            }
	            else{
	                front++;
	            }
	            size--;
	            return data;
	        }
	        
	        // creating removerear funciton();
	        public static int removerear(){
	            if(isempty()){
	                System.out.println("underflow");
	                return -1;
	                
	            }
	            int data = arr[rear];
	            if(front==rear){
	                front=-1;
	                rear=-1;
	            }
	            else if(rear==0){
	                rear=arr.length-1;
	            }
	            else{
	                rear--;
	            }
	            size--;
	            return data;
	        }
	        
	        // creating peekfront and peekrear
	        public static int peekfront(){
	            if(isempty()){
	                System.out.println("underflow");
	                return -1;
	            }
	            return arr[front];
	        }
	        
	        public static int peekrear(){
	            if(isempty()){
	                System.out.println("underflow");
	                return -1;
	            }
	            return arr[rear];
	        }
	        
	    }
		public static void main(String[] args) {
			Deque q = new Deque(6);
			q.addfront(2);
			q.addfront(5);
			q.addrear(8);
			q.addfront(9);
			q.addrear(1);
			while(!q.isempty()){
			    System.out.println(q.peekfront());
			    q.removefront();
			}
		}
	}

