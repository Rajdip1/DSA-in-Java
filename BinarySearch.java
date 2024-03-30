import java.io.*;
import java.util.*;

class BinarySearch {

    public static int binarySearch(int arr[], int size, int key){
        int start = 0;
        int end = size-1;

        int mid = start + (end - start)/2;

        while(start <= end){
            if(arr[mid]==key){
                return mid;
            }

            if(key > arr[mid]){  //for right side
                start = mid+1;
            }
            else{  //for left side
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array size: ");
       int size = sc.nextInt();
       int array[] = new int[size];

       //input
       System.out.println("Enter array elements:");
       for(int i=0; i<array.length; i++){
        array[i] = sc.nextInt();
       }

       System.out.println("Enter key: ");
       int key = sc.nextInt();

       int ans = binarySearch(array, size, key);
       System.out.println("Element present at index: "+ans);

    }
}
