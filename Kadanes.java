import java.util.*;

public class Kadanes {
    public static void ka(int n[]){
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n.length; i++){
            sum=sum+n[i];
            if (sum<0) {
                sum=0;
            }
            if (max<sum) {
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int n[]= {-2,-3,4,-1,-2,1,5,-3};

        ka(n);
    }    
}
