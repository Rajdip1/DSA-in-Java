import java.io.*;
import java.util.*;

public class Recursion {
    //print number 5 to 1
    // public static void printNumbers(int n){
    //     //base case
    //     if(n==0){
    //         return;
    //     }

    //     System.out.println(n);
    //     printNumbers(n-1);
    // }
    // public static void main(String[] args){
    //     int n =5;
    //     printNumbers(n);
    // }


    //print number 1 to 5
    // public static void printNumbers(int n){
    //     //base case
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n+1);
    // }
    // public static void main(String[] args){
    //     int n=1;
    //     printNumbers(n);
    // }


    //print sum first n natural numbers
    // public static void printSum(int i, int n, int sum){
    //     if(i==n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }
    // public static void main(String[] args){
    //     printSum(1, 5, 0);
    // }


    //print factorial of number n
    // public static int calculateFact(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int factorial = n*calculateFact(n-1);
    //     return factorial;
    // }
    // public static void main(String[] args){
    //     int n=5;
    //     int ans = calculateFact(n);
    //     System.out.println(ans);
    // }


    //print the fibonacci sequence till nth term
    // public static void printFib(int a,int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c=a+b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String[] args){
    //     int a=0, b=1;
    //     int n = 7;
    //     System.out.println(a);
    //     System.out.println(b);
    //     printFib(a, b, n-2);
    // }


    //print x^n (stack height = n)
    // public static int calculatePower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
    //     // int xPowm1 = calculatePower(x, n-1);
    //     // int xPown = x * xPowm1;
    //     int power = x*calculatePower(x, n-1);
    //     return power;
    // }
    // public static void main(String[] args){
    //     int x = 2;
    //     int n = 5;
    //     int ans = calculatePower(x, n);
    //     System.out.println(ans);
    // }


    //print x^n (stack height = logn)
    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        }
        else{
            //n is odd
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args){
        int x=2, n=5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }
}
