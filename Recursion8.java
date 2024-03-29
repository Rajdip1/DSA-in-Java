//Print all the unique subsequences of a string

import java.util.HashSet;

class Recursion8 {
    public static void uniqueSubsequence(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(index);

        //to be
        uniqueSubsequence(str, index+1, newString+currentChar, set);

        //not to be
        uniqueSubsequence(str, index+1, newString, set);
    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);
    }    
}
