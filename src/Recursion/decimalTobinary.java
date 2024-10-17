package Recursion;

public class decimalTobinary {
    public static void main(String[] args) {
        System.out.println(DecimalToBinary(2));
    }
    public static int DecimalToBinary(int n ){
        if( n == 0 ) return  0 ;
        return n%2 + DecimalToBinary(n/2 ) ;
    }

}
