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

public static void inc(int num){
    if (num==1) {
        System.out.print(num + " ");
        return;
    }
    inc(num-1);
    System.out.print(num + " ");
}

public static int fac(int num){
    if (num==0) {
        return 1;
    }
    int fnm1=fac(num-1);
    int fn = num * fnm1;
    return fn;
}

public static int calsum(int num){
    if (num==1) {
        return 1;
    }
    int sum1= calsum(num-1);
    int sum=num+sum1;
    return sum;
}

public static int fib(int num){
    if (num==0 || num==1) {
        return num;
    }
    
    int fnm1=fib(num-1);
    int fnm2=fib(num-2);
    int f=fnm1+fnm2;
    return f;
}

public static boolean sorted(int arr[], int i){
    if (i==arr.length-1) {
        return true;
    }
    if (arr[i]>arr[i+1]) {
        return false;
    }

    return sorted(arr, i+1);
}
    public static void main(String args[]){
        // int num =10;
        // dec(num);
        // System.out.println(" ");
        // inc(num);
        // System.out.println(fac(5));
        // System.out.println(calsum(5));
        // System.out.println(fib(6));
        int arr[]={1,2,3,4,5};
        System.out.println(sorted(arr, 0));
    }    
}
