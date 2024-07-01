public class MergerSortedArray {
    public static void merge_Sorted_Array(int nums1[], int m, int nums2[], int n) {
        int i = m-1;  //last pointer at nums1[]
        int j = n-1;  //last pointer at nums2[]
        int k = m+n-1; //last pointer at num1[] last zero position

        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        //copy if any element remain in nums2
        while(j>=0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String args[]) {
        int num1[] = {1,2,3,0,0,0};
        int m = 3;
        int num2[] = {2,5,6};
        int n = 3;

        merge_Sorted_Array(num1, m, num2, n);

        //printin array
        for(int i=0; i<m+n; i++) {
            System.out.print(num1[i]+" ");
        }
        System.out.println();
        
    }
}
