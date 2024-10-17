package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(Power(2,2));
    }
    public static int Power(int base , int exp){
        if(exp == 0 ) return 1 ;
        if(exp == 1 ) return base ;
        return base * Power(base , exp-1 ) ;
    }
}
