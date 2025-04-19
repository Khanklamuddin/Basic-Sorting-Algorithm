import java.util.*;
// Bubble Sort solutions
public class PracticeQ{
    public static void bubbleSort(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // SELCTION SORT ALGO
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minposi = i;
            for(int j=i+1; j<arr.length-1; j++) {
                if(arr[minposi] < arr[j]) {
                    minposi = j;
                }
            }
            //swap 
            int temp = arr[minposi];
            arr[minposi] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion sort 
    public static void insertion(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev]> curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    
    public static void main(String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertion(arr);
        printarr(arr);
    }
}
