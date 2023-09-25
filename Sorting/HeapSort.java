// >>>>>>>>>>>>>>>>>Heap Sort using the MaxHeap to sort in ascending order<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// import java.util.*;
// public class HeapSort{
//     public static void heapify(int arr[], int i, int size){
//         // for left node and for right node
//         int left = 2*i+1;
//         int right = 2*i+2;
//         // for root node it should be equal to i
//         int minIdx = i;

//         // if the left child is greater than parent then make that as new maximum index
//         if(left<size && arr[left] > arr[minIdx]){
//             minIdx = left;
//         }

//         if(right<size && arr[right] > arr[minIdx]){
//             minIdx = right;
//         }

//         if(minIdx!=i){
//             int temp = arr[i];
//             arr[i] = arr[minIdx];
//             arr[minIdx] = temp;

//             heapify(arr, minIdx, size);
//         }
//     }
//     public static void heapSort(int arr[]){
//         // step1 : build MaxHeap
//         int n = arr.length;
//         for(int i=n/2;i>=0;--i){
//             heapify(arr, i, n);
//         }

//         // step2 : push largest at the end
//         for(int i=n-1;i>0;i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }

//     }
//     public static void main(String[] args){
//         int[] arr = {1, 3, 5, 4, 2, 7, 6};
//         int n = arr.length;
//         System.out.println("Before sorting");
        
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         heapSort(arr);
//         System.out.println();
//         System.out.println("After sorting");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     } 
// }







// >>>>>>>>>>>>>>>>>Heap Sort using the MinHeap to sort in decending order<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
import java.util.*;
public class HeapSort{
    public static void heapify(int arr[], int i, int size){
        // for left node and for right node
        int left = 2*i+1;
        int right = 2*i+2;
        // for root node it should be equal to i
        int minIdx = i;

        // if the left child is greater than parent then make that as new maximum index
        if(left<size && arr[left] < arr[minIdx]){
            minIdx = left;
        }

        if(right<size && arr[right] < arr[minIdx]){
            minIdx = right;
        }

        if(minIdx!=i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, size);
        }
    }
    public static void heapSort(int arr[]){
        // step1 : build MaxHeap
        int n = arr.length;
        for(int i=n/2;i>=0;--i){
            heapify(arr, i, n);
        }

        // step2 : push largest at the end
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 2, 7, 6};
        int n = arr.length;
        System.out.println("Before sorting");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        heapSort(arr);
        System.out.println();
        System.out.println("After sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}