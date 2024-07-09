import java.io.*;

/*
   Problem is known as Moore's voting algorithm
 */

public class MajorityElement {
    public static int major_element(int arr[], int n) {
        int candidate = 0;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(count==0) {
                candidate = arr[i];
            }
            if(candidate==arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int n = arr.length;

        System.out.println("Major element: "+major_element(arr, n));
    }
}
