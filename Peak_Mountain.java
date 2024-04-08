import java.io.*;
import java.util.*;

class Peak_Mountain {

    public static int peak_indexOfMountain(int arr[], int n){
        int start = 0;
        int end = n-1;

        int mid = start + (end - start)/2;

        while(start < end){
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Peak index of Mountain array is: "+peak_indexOfMountain(array, size));
    }
}
