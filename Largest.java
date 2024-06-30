import java.util.*;

public class Largest {
    public static int l(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if (largest < number[i]) {
                largest=number[i];
            }
            if (smallest>number[i]) {
                smallest=number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[] = {12,22,68,2,8};
        System.out.println(l(number));
    }    
}
