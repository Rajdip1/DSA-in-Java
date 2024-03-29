import java.io.*;
import java.util.*;

class sorting {
    // public static void printArray(int array[]){
    //     for(int i=0; i<array.length; i++){
    //         System.out.print(array[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args){
    //     int array[] = {7,8,3,1,2};

    //     //bubble sort
    //     for(int i=0; i<array.length-1; i++){
    //         for(int j=0; j<array.length-i-1; j++){
    //             if(array[j]>array[j+1]){
    //                 //swap
    //                 int temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
    //         }
    //     }
        
    //     printArray(array);
    // }    


    //Selection sort
    // public static void main(String[] args){
    //     int arr[] = {7,8,3,1,2};

    //     for(int i=0; i<arr.length-1; i++){
    //         int small = i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[small]>arr[j]){
    //                 small = j;
    //             }
    //         }
    //         //swap
    //         int temp = arr[small];
    //         arr[small] = arr[i];
    //         arr[i] = temp;
    //     }

    //     printArray(arr);
    // }

    // public static void printArray(int array[]){
    //     for(int i=0; i<array.length; i++){
    //         System.out.print(array[i]+" ");
    //     }
    //     System.out.println();
    // }


    //Insertion sort
    public static void main(String[] args){
        int array[] = {7,8,3,1,2};

        for(int i=0; i<array.length; i++){
            int current = array[i];
            int j = i-1;

            while(j >= 0 && current <= array[j]){
                array[j+1] = array[j];
                j--;
            }
            //placement of element
            array[j+1] = current;
        }
        printArray(array);
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
