import java.util.*;

public class Revarr {
    public static void rev(int num[]){
        int first=0, last= num.length-1;

        while (first<last) {
            int temp = num[last];
            num[last]=num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }
    
    public static void main(String args[]){
        int num[] = {3,6,23,8,9};
        rev(num);

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }    
}
