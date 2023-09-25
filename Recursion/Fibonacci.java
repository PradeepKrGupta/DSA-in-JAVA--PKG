// package Recursion;
import java.util.*;
import java.io.*;

public class Fibonacci {
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number of terms you want");
		int n = read.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print(fibo(i)+" ");
		}
		

	}

}
