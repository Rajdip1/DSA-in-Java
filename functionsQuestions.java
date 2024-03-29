import java.io.*;
import java.util.*;
import java.math.*;

class functionsQuestions {

    //Q.1 take 3 num and print avg
    // public static int average(int a, int b, int c){
    //     int avg = (a+b+c)/3;
    //     return avg;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter three numbers: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     int avg = average(a, b, c);
    //     System.out.println(avg);

    // }    


    //Q.2 function to print the sum of all odd num from 1 to n
    // public static int sumOfOdd(int n){
    //     int sum = 0;
    //     for(int i=1; i<=n; i+=2){
    //         sum+=i;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number:");
    //     int n = sc.nextInt();

    //     int sum = sumOfOdd(n);
    //     System.out.println("Output:");
    //     System.out.println(sum);
    // }

    //Q.3 Take 2 num & print greater of those two
    // public static int printGreaterNum(int a,int b){ 
    //     if(a>b){
    //         return a;
    //     }
    //     else{
    //         return b;
    //     }
        
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println(printGreaterNum(a, b));

    // }

    //Q.4 funvtion that take radius as input & return circumference of circle
    // public static double circumferenceOfCircle(double radius){
    //     double circumferenceOfCircle = 2*3.14*radius;
    //     return circumferenceOfCircle;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter radius: ");
    //     double radius = sc.nextInt();

    //     double sum = circumferenceOfCircle(radius);
    //     System.out.println("Answer is: ");
    //     System.out.println(sum);

    // }

    //Q.5 take age as input and print whether user is eligible for voting or not.
    // public static void printVotingEligibility(int age){
    //     if(age>=18){
    //         System.out.println("Your are eligible for voting");
    //     }
    //     else{
    //         System.out.println("You're not couse you under 18");
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your age: ");
    //     int age = sc.nextInt();

    //     printVotingEligibility(age);
    // }


    //Q.6 positive, negative or zero
    // public static void printTypeOfNumber(int n){
    //     if(n>0){
    //         System.out.println("positive number");
    //     }
    //     else if(n<0){
    //         System.out.println("negative number");
    //     }
    //     else{
    //         System.out.println("zero entered");
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
        
    //     printTypeOfNumber(n);
    // }

    //Q.7 input x,n find power of one of them
    // public static double findPower(double x, double n){
    //     double power = Math.pow(x,n);
    //     return power;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter value x:");
    //     double x = sc.nextInt();
    //     System.out.println("Enter value n:");
    //     double n = sc.nextInt();

    //     double pw = findPower(x, n);
    //     System.out.println(pw);
    // }

    //Q.8 fibonacci series
    // public static void printFibonacci(int n){
    //     int n1 = 0;
    //     int n2 = 1;

    //     for(int i=0; i<=n; i++){
    //         int nextNum = n1+n2;
    //         System.out.print(n1+" ");
    //         n1=n2;
    //         n2=nextNum;
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     printFibonacci(n);
    // }
    

    //Q.9 find GCD of two num
    // public static int findgcd(int num1, int num2){

    //     int gcd = 1;

    //     // for(int i=1; i<=num1 && i<=num2; i++){
    //     //     if((num1 % i)==0 && (num2 % i)==0){
    //     //         gcd = i;
    //     //     }
    //     // }

    //     //or
    //     while(num1 != num2){
    //         if(num1>num2){
    //             num1 = num1-num2;
    //         }
    //         if(num2>num1){
    //             num2=num2-num1;
    //         }
    //     }
    //     return num1;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int num1 = sc.nextInt();
    //     int num2 = sc.nextInt();

    //     int sum = findgcd(num1, num2);
    //     System.out.println(sum);
    // }

    //Q.10 infinite loop using do while
    // public static void main(String[] args){

    //     int i=0;

    //     do{
    //         System.out.println("infinite loop");
    //         i++;
    //     }
    //     while(i<0);
    // }
}
