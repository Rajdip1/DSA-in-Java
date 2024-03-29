import java.io.*;
import java.util.*;

class StringsQuestions {
    //Q.1 take array of strings input and find the comulative(combined) length of all those strings
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     System.out.println("Enter strings: ");
    //     String array[] = new String[size];

    //     int totoalLength = 0;

    //     for(int i=0; i<size; i++){
    //         array[i] = sc.next();
    //         totoalLength += array[i].length();
    //     }
    //     System.out.println(totoalLength);
    // }


    //Q.2 Input a string from user. Create a new string called 'result'
    // in which you will replace the letter 'e' in the original string with
    // letter 'i'
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a string: ");
    //     String str = sc.next();
    //     String result = "";

    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)=='e'){
    //             result += "i";
    //         }
    //         else{
    //             result += str.charAt(i);
    //         }
    //     }
    //     System.out.println("Resulted strings is: "+ result);

    // }

    //Q.3 Input an email from the user. Ypu have to crete
    // username from email by deleting part comes after '@'
    //display username
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.next();
        String userName = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                userName += email.charAt(i);
            }
        }
        System.out.println("Your username is: "+ userName);
    }
}
