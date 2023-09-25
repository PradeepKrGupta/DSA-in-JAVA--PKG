// package DataStructure;
import java.util.*;

public class QueueUsingJavaFrameWork {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque();
		q.add(2);
		q.add(3);
		q.add(5);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
