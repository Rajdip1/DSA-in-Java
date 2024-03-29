//Count total paths in a maze to move from (0,0) to (n,m)   n=3, m=3

class Recursion11 {

    public static int count_Total_NumOf_Paths(int n, int m, int i, int j){

        if(i==n || j==m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }
        
        //move downwards
        int downwardPaths = count_Total_NumOf_Paths(n, m, i+1, j);

        //move right
        int rightPaths = count_Total_NumOf_Paths(n, m, i, j+1);

        return downwardPaths + rightPaths;
    }

    public static void main(String[] args){
        int n=3;
        int m=3;

        int totalPath = count_Total_NumOf_Paths(n, m, 0, 0);
        System.out.println("Total paths are "+totalPath);
    }
}
