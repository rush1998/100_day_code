import java.util.*;
public class count {
    public static void co(int arr[]){
        int maxlen = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxlen= Math.max(maxlen, arr[i]);
        }

        int count[] = new int[maxlen+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {
                arr[j]= i;
                count[i]--;
                j++;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]= {1,4,1,3,2,4,3,7};
        co(arr);
        print(arr);
    }    
}
