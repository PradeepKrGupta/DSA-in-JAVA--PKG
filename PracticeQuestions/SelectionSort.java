
package PracticeQuestions;
import java.util.*;

public class SelectionSort {
	public static void bubble(int arr[], int size) {
		for(int i=0;i<size;i++) {
			int idx = i;
			for(int j=i+1;j<size;j++) {
				if(arr[idx]>arr[j]) {
					int temp = arr[idx];
					arr[idx]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array elements are");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = read.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in arry");
		for(int i=0;i<size;i++) {
			arr[i]=read.nextInt();
		}
		
		bubble(arr, size);

	}

}
