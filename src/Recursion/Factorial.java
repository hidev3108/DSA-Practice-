package Recursion;

public class Factorial {

    // n! = n*(n-1)!
    // base case 0 ! = 1 && 1! = 1
    // base case n<0 return -1
    public  static int factorial(int n){
        if(n<0) return -1 ;
        if(n==0 || n==1 ) return 1 ;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(-1));
    }
}
