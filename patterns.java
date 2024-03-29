import java.io.*;
import java.util.*;

/**
 * patterns
 */
class patterns {
    public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for(int i=1; i<=n; i++){

    //         for(int j=1; j<=n; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // int n=4;
        // int m=5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 4;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;

        // //outer loop
        // for(int i=n; i>=1; i--){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n =5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=i; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n=4;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //space loop
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //star loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n=5;
       
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Floyd's triangle
        // int n=5;

        // int count=1;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        //0-1 triangle
        // int n=5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         int sum = i+j;
        //         if(sum%2==0){ //even
        //             System.out.print("1 ");
        //         }
        //         else{ //odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //butterfly patten
        // int n=4;

        // //upper half
        // for(int i=1; i<=n; i++){
        //     //first part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            
        //     //spaces
        //     int space = 2*(n-i);
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     //second part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //lower half
        // for(int i=n; i>=1; i--){
        //     //first part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            
        //     //spaces
        //     int space = 2*(n-i);
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     //second part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //solid rhombus pattern
        // int n=5;

        // for(int i=1; i<=n; i++){

        //     //spaces
        //     int space = n-i;
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //number pyramid pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     int space = n-i;
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //Palindromic pattern
        // int n=5;

        // for(int i=1; i<=n; i++){
        //     //spaces
        //     int spaces = n-i;
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     //first half bumbers
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }

        //     //second half numbers
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //Diamond pattern
        int n=4;

        //upper half
        for(int i=1; i<=n; i++){
            //spaces
            int space = n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //first part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //second part stars
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){
            //spaces
            int space = n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //first part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //second part stars
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}