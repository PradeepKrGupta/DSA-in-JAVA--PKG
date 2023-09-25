// package Recursion;
import java.util.*;
import java.lang.*;

public class LargestinArray {
	public static int largest(int size, int[] arr) {
		if(size == arr.length-1) {
			return arr[size];
		}
		int max = largest(size+1,arr);
		if(max>arr[size]) {
			return max;
		}
		else {
			return arr[size];
		}
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = read.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements inside the array");
		for(int i=0;i<size;i++) {
			arr[i]=read.nextInt();
		}
		System.out.println("The elements of array are:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int large = largest(0, arr);
		System.out.println("The largest number in array is :"+large);
	}

}
