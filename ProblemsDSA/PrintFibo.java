package ProblemsDSA;
import java.util.*;

public class PrintFibo {
	public static int printfibo(int n) {
		if(n<=1) {
			return n;
		}
		return printfibo(n-1)+printfibo(n-2);
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number to find fibonacci number");
		int n = read.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(printfibo(i));
		}

	}

}
