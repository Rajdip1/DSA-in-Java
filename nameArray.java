import java.io.*;
import java.util.*;

class nameArray {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     System.out.println("Enter names: ");
    //     String name[] = new String[size];

    //     for(int i=0; i<size; i++){
    //         name[i] = sc.next();
    //     }

    //     for(int i=0; i<name.length; i++){
    //         System.out.println("Names "+(i+1)+" is : "+name[i]);
    //     }
    // }


    //Q.2 find the max and min num in ar array of intigers
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     System.out.println("Enter numbers: ");
    //     int num[] = new int[size];

    //     for(int i=0; i<num.length; i++){
    //         num[i] = sc.nextInt();
    //     }

    //     // int max = num[0];
    //     // int min = num[0];

    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;

    //     for(int i=0; i<num.length; i++){
    //         if(num[i]<min){
    //             min = num[i];
    //         }
    //         if(num[i]>max){
    //             max = num[i];
    //         }
    //     }
    //     System.out.println("Maximum number is : "+max);
    //     System.out.println("Minimum  number is : "+min);
    // }

    //Q.3 take an array of num as input and check if it is an array sorted in ascending order
    //3,4,6,2

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter your array elements: ");
        int number[] = new int[size];

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<number.length-1; i++){
            if(number[i]>number[i+1]){
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
        
    }

}
