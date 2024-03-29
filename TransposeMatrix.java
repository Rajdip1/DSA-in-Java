import java.io.*;
import java.util.*;

class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int col = sc.nextInt();

        System.out.println("Enter matrix elements: ");

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose matrix is: ");

        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
