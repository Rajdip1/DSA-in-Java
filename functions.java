//functions or methods

import java.io.*;
import java.util.*;

class functions {

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int printSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }

    public static int productOfNumbers(int a,int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);//called funtion

        int a = sc.nextInt();
        int b = sc.nextInt();

        // int sum = printSum(a,b);
        // System.out.println(sum);

        int product = productOfNumbers(a, b);
        System.out.println(product);
    }
}
