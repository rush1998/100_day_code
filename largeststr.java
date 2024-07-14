import java.util.*;

public class largeststr {
    public static void main(String args[]){
        String fruits[]= {"mango", "banana", "kiwi"};
        String length=fruits[0];
        for(int i=1; i<fruits.length; i++){
            if (length.compareTo(fruits[i])<0) {
                length=fruits[i];
            }
        }
        System.out.println(length);
    }    
}
