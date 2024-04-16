//Search in sorted rotated array
import java.io.*;
import java.util.*;

class SortedRotatedArr {
    public static int getPivot(int arr[], int n){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;

        while(s < e){   
            //case 1: right part sorted
            if(arr[mid] >= arr[0]){
                s = mid+1;
            }
            else{       
                //case 2: left part sorted
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    public static int binarySearch(int arr[], int s, int e, int k){
        int start = s;
        int end = e;
        int mid = start + (end-start)/2;

        while(start <= end){
            //case 1
            if(arr[mid]==k){
                return mid;
            }
            
            //case 2: Right part sorted
            if(k > arr[mid]){
                start = mid+1;
            }
            else{      
                //case 3: Left part sorted
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter key: ");
        int key = sc.nextInt();

        int pivot = getPivot(array, size);

        if(array[pivot] <= key && key <= array[size-1]){
            //right part sorted
            System.out.println(binarySearch(array, size, size-1, key));
        }
        else{
            //left part sorted
            System.out.println(binarySearch(array, 0, pivot-1, key));
        }

    }    
}
