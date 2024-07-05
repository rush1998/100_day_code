import java.util.*;
public class Subarr{
    public static void sub(int num[]){
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]);
                    sum=sum+num[k];
                    if (min>sum) {
                        min=sum;
                    }
                    if (max<sum) {
                        max=sum;
                    }
                }
                System.out.print(" =>sum:" + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("min num is:"+min);
        System.out.println("max num is:"+max);
    }
    public static void main(String args[]){
        int num[]= {3,4,6,8,9};
        sub(num);
        
    }
}