import java.io.*;
import java.util.*;

class stringBuilder {
    public static void main(String[] args){
        // StringBuilder sb = new StringBuilder("Tony");
        // // System.out.println(sb);
        // sb.append('s');
        // sb.append('t');
        // sb.append('a');
        // sb.append('r');
        // sb.append('k');
        // System.out.println(sb.length());
        //char at index 0
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        //insert
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //delete extra 'n'
        // sb.delete(2, 4);
        // System.out.println(sb);


        //reverese string
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; //5-1-0=4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
