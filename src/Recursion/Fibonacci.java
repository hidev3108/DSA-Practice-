package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    // 0 1 1 2 ......
    //f(0) == 0 , f(1) == 1  , f(2) == 1 , f(3) == 2 , f(4) == 3
    // fibonacci(n) == fibonacci(n-1) + fibonacci(n-2)
    // base case f(0) == 0 , f(1) == 1 && n<0
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
