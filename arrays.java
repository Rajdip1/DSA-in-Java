import java.io.*;
import java.util.*;

class arrays {
    public static void main(String[] args){
        // int[] marks = new int[3];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // int marks[] = {95,98,97};

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number size");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // //input
        // System.out.println("Enter numbers");
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // System.out.println("Enter x");
        // int x = sc.nextInt();

        // //output
        // for(int i=0; i<size; i++){ //'numbers.length' can be also use

        //     // System.out.println(numbers[i]);

        //     if(numbers[i]==x){
        //         System.out.println("x found at index "+i);
        //     }
        // }



        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] numbers = new int[row][col];
        
        //input
        //controlling rows
        for(int i=0; i<row; i++){
            //controlling columns
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        // System.out.println("Your output: ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location : ("+ i +","+ j +")");
                }
            }
        }

    }
}
