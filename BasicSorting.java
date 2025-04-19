import java.util.*;
// BUBBLE SORT 

public class BasicSorting{
    // function create kiya 
    public static void bubblesort(int arr[]) {
        // Outer loop chalega 0 se 3 tak
        for(int turn=0; turn<arr.length-1; turn++){
           // inner loop  
            for(int j=0; j<arr.length-1-turn; j++){
                // check karna current element next element se bada hai
                if(arr[j] >arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // function create kiya array ko print karne ke liye

    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
// SELECTION SORT PROGRAM 
    public static void selectionSort(int arr[]) {
        //outer loop n-2 tak 0 se 3 tak
        for(int i=0; i<arr.length-1; i++)  {
            int minPos = i;
            // minposion hamara current position hai
            // Inner loop 
            for(int j=i+1; j<arr.length-1; j++){
                // agar minpositon ki value badi ho jati hai array at postion j par tab swap kar denge 
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap value --> min ko curr ke sath swap kiya 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    // COUNTING SORT ALGORITHM
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;

        }

        // sorting 
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Insertion sort code 
    public static void InsertionSort(int arr[]) {
        // Outer loop jayega n-1 tak 
        for(int i=0; i<arr.length; i++) {
            // current equal to i
            int curr = arr[i];
            int prev = i-1;
            // jab tak previous ele 0 se bada hai tb tak use peeche push karna hai 
            // finding out to correct postion to insert 
            while(prev >= 0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;

            }
            // insertion 
            arr[prev+1] = curr;

        }
    }

    public static void main (String args[]) {
        int arr[] = {5,4,1,3,2};
        // bubblesort(arr);
        // selectionSort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr, Collections.reverseOrder());
        // countSort(arr);
        InsertionSort(arr);
        printarr(arr);
    }
}