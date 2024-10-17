package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(23));
    }
    public static int sumOfDigits(int n ){
        if (n<0 ) return 0 ;
        if (n == 0  ) return 0 ;
        return n%10 + sumOfDigits(n/10) ;
    }
}
