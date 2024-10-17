package Recursion;

public class PermutationOFString {
    public static void main(String[] args) {
        String str = "ABC" ;
        String ans = "" ;
        printPermutation(str,ans);
    }

   static void printPermutation(String str, String ans) {
        if (str.length() == 0 ) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1) ;
            printPermutation(ros,ans+ch);
        }
    }
}
