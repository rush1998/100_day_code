import java.util.*;

public class Bubble {
    public static void b(int arr[]){
        for(int sort=0; sort<arr.length-1; sort++){
            int sorted =0;
            for(int j=0; j<arr.length-1-sort; j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    sorted++;                     
                }
            }
            if (sorted == 0) {
                break;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        b(arr);
        printarr(arr);
    }    
}
