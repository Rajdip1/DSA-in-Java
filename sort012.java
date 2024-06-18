import java.io.*;
import java.util.*;

/**
 * sort012
 */
class sort012 {
    public static void printArray(int arr[], int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int sort012(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
            else {
                mid++;
            }
        }
        //it is asking return type here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

       System.out.println(sort012(num, size));
       System.out.println(printArray(num, size));
    }
}