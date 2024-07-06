import java.util.*;
public class Arrayass {
    public static boolean twice(int nums[]){
        for(int i=0; i<1; i++){
            for(int j=1; j<nums.length; j++){
                if (nums[i]==nums[j]) {
                   return true;
                }
            }
    }
    return false;
}
public static int qtwo(int nums[], int target){
    for(int i=0; i<nums.length; i++){
        if (nums[i]== target) {
            return i;
        }
    }
    return -1;
}

public static int profit(int price []){
    int buy=price[0];
    int p=0;
    for(int i=0; i<price.length; i++){
    
        if (buy<price[i]) {
            p = Math.max(price[i] - buy, p);
        }else{
            buy=price[i];
        }
    }
    return p;
}

public static int watertrapped(int height[]){
    int barhl []= new int[height.length];
    barhl[0]= height[0];
    for(int i=1; i<height.length; i++){
        barhl[i]= Math.max(height[i],barhl[i-1]);
    }

    int barhr []= new int[height.length];
    barhr[height.length-1]= height[height.length-1];
    for(int i=height.length-2; i>=0; i--){
        barhr[i]=Math.max(height[i],barhr[i+1]); 
    }

    int minlr[] = new int[height.length];
    for(int i=0; i<height.length; i++){
        minlr[i]= Math.min(barhl[i], barhr[i]);
    }

    int area=0;
    for(int i=0;i<height.length; i++){
        area = area +(minlr[i]-height[i]);
    }
    return area;
}

public static void triplets(int nums[]){
    for(int i=0; i<nums.length; i++){
        for(int j=i; j<nums.length; j++){
            for(int k=i; k<=j; k++){
                
            }
            System.out.println();
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        // int nums[] = {1,2,3,4};
        // System.out.println(twice(nums));
        // int nums[] = {4,5,6,7,0,1,2};
        // int target= 0;  
        // System.out.println(qtwo(nums,target));
        // int price [] = {7,1,5,3,6,4};
        // System.out.println(profit(price));
        // int height []= {4,2,0,3,2,5};
        // System.out.println(watertrapped(height));
        int nums[]= {-1,0,1,2,-1,-4};
        triplets(nums);
    }
}
