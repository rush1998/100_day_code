import java.util.*;

public class Selection {
    public static void sel(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int sort=i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[sort]>arr[j]) {
                    sort=j;  
                }
            }
            int temp= arr[sort];
            arr[sort]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        sel(arr);
        print(arr);
    }    
}
