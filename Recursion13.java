
//Find the no of ways in which you can invite n people to your party, single
// or in pairs

class Recursion13 {
    public static int callGuest(int n){

        if(n<=1){
            return 1;
        }

        //single
        int singleCall = callGuest(n-1);

        //pair
        int pairCall = (n-1) * callGuest(n-2);

        return singleCall + pairCall;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(callGuest(n));
    }
}
