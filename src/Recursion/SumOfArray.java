package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
       int arr [] = {2,4,6,8};
       int n = arr.length ;
        System.out.println(sumofArray(arr,n));
    }
   static int sumofArray(int arr [] ,int n){
        //base case
        if (n <= 0) return 0 ;
        return arr[n-1] + sumofArray(arr,n-1) ;
    }

}
