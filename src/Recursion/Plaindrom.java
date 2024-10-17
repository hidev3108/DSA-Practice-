package Recursion;

public class Plaindrom {
    // Madam let us write reverse for String
    String isReverse(String s ){
        if(s.isEmpty()) return "";
        return isReverse(s.substring(0))+s.charAt(1);
    }


   boolean isPlaindrome(String str , int  start , int  end ){
        if(start >= end ) return false ;
        if(str.charAt(start) != str.charAt(end) ) return false ;
        return isPlaindrome(str,start+1,end-1) ;
   }

}
