// package Sorting;
import java.util.*;
import java.io.*;

public class Bubble_Sorting{
	public static void Bubble(int arr[], int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("The sorted array elements are :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = read.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++) {
			arr[i]= read.nextInt();
		}
		System.out.println("The unsorted array elements are :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		Bubble(arr,n);

	}

}
