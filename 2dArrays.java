import java.io.*;
import java.util.*;

class 2dArrays {
    public static void main(String[] args){

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

        //output
        System.out.println("Your output: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
