/**
 * FirstAndLast_occurance
 */
import java.io.*;
import java.util.*;

class FirstAndLast_occurance {
    public static int firstOccurance(int arr[], int n, int key){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid]==key){
                ans = mid;
                e = mid-1;
            }
            else if(key>arr[mid]){ //right side move
                s = mid+1;
            }
            else{  //(key<arr[mid]  left side move)
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    public static int lastOccurance(int arr[], int n, int key){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid]==key){
                ans = mid;
                s = mid+1;
            }
            else if(key>arr[mid]){ //right side move
                s = mid+1;
            }
            else{  //(key<arr[mid]  left side move)
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        System.out.println("First Occurance at index: "+ firstOccurance(array, size, key));
        System.out.println("Last Occurance at index: "+ lastOccurance(array, size, key));
    }    
}