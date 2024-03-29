import java.io.*;
import java.util.*;

class helloduniya{
    public static void main(String[] args){
        System.out.println("Hello Duniya :)");


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();


        // for(int i=1; i<=n; i++){
        //     System.out.print("* ");

        //     for(int j=1; j<=i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }


        // String name = "Tony Stark";
        // System.out.println(name);

        // Scanner sc = new Scanner(System.in);
        // String name2 = sc.next();
        // System.out.println(name2);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n1: ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter n2: ");
        // int n2 = sc.nextInt();

        // int sum = n1+n2;
        // System.out.println("Answer is" +sum);

        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not adult");
        // }

        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // if(x%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("equal");
        // }
        // else if(a>b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("a is lesser");
        // }

        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button==1){
        //     System.out.println("namaste");
        // }
        // else if(button==2){
        //     System.out.println("hello");
        // }
        // else if(button==3){
        //     System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("invalid button");
        // }

        // switch (button) {
        //     case 1: System.out.println("namaste");
        //         break;

        //     case 2: System.out.println("hello");
        //         break;
            
        //     case 3: System.out.println("bonjour");
        //         break;

        //     default: System.out.println("invalid button");
        //         break;
        // }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        char op = sc.next().charAt(0);

        switch(op){
            case '+':  System.out.println((a+b));
                break;

            case '-':  System.out.println((a-b));
                break;
                
            case '*': System.out.println((a*b));
                break;

            case '/': System.out.println((a/b));
                break;
                
            case '%': System.out.println((a%b));
                break;

            default: System.out.println("invalid input");
        }
    }
}