import java.util.*;

public class Palindrome {
    public static boolean pal(String name){
        for(int i=0; i<name.length()/2; i++){
            int n=name.length();
            if (name.charAt(i)!= name.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String name="fun";
        System.out.println(pal(name));
    }    
}
