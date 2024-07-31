import java.util.*;
public class Recursion {
    
public static void dec(int num){
    if (num==1) {
        System.out.print(num);
        return;
    }
    System.out.print(num + " ");
    dec(num-1);
}
    public static void main(String arga[]){
        int num =10;
        dec(num);
    }    
}
