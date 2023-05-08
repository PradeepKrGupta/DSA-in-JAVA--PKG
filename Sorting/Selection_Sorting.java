package Sorting;
import java.util.*;

public class Selection_Sorting {
	public static void selection(int arr[], int n) {
		for(int i = 0;i<n-1;i++) {
			int index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[index]) {
					index=j;
					
				}
			}
			int temp = arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = read.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the array :");
		for(int i=0;i<n;i++) {
			arr[i]=read.nextInt();
		}
		System.out.println("The unsorted array elements are:");
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("The sorted array using selection sorting method are:");
		selection(arr,n);

	}

}
