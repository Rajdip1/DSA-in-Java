import java.io.*;

//Check if an array is sorted (Strictly increasing)
class Recursion4 {
    public static boolean isSorted(int array[],int index){
        if(index == array.length-1){
            return true;
        }

        if(array[index] < array[index+1]){
            //array is sorted till now
            return isSorted(array, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4};

        System.out.println(isSorted(array, 0));

        // if (isSorted(array, 0)) {
        //     System.out.println("Array is sorted");
        // }
        // else{
        //     System.out.println("Not sorted");
        // }
    }
}
