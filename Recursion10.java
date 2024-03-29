import java.io.*;
import java.util.*;

//Print all permutations of a string

class Recursion10 {
    public static void permutations(String str, String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);

            //"abc" -> "bc"
            String newString = str.substring(0,i) + str.substring(i+1);
            permutations(newString, permutation+currentChar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        permutations(str, "");
    }
}
