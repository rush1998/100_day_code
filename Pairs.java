import java.util.*;

public class Pairs {
    public static void p(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int num[] = {2,5,6,7,9};
        p(num);
    }    
}
