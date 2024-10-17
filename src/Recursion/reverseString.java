package Recursion;

public class reverseString {
    public static String ReverseString (String str ){
        if(str.isEmpty()) return str;
        return ReverseString(str.substring(1)) + str.charAt(0) ;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("Himanshu"));
    }
}
