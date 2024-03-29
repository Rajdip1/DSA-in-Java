import java.io.*;
import java.util.*;

//Recursion
public class ReversString {

    public static void reverseString(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }
    public static void main(String[] args){
        String str = "abcd";
        reverseString(str,str.length()-1);
    }
}
