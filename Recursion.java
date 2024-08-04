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

public static int firstOcc(int arr[], int key, int i){
    if (i==arr.length) {
        return -1;
    }

    if (arr[i]==key) {
        return i;
    }
    return firstOcc(arr, key, i+1);
}

public static int lastOcc(int arr[],int key, int i){
    if (i==arr.length) {
        return -1;
    }
    
    int isfound = lastOcc(arr, key, i+1);
    
    if (isfound==-1 && arr[i]==key) {
        return i;        
    }
    return isfound;
}

public static int power(int x, int n){
    if (n==0) {
        return 1;
    }
    return x * power(x ,n-1);
}

public static int oppower(int x, int n){
    if (n==0) {
        return 1;
    }
    int halfpow=  oppower(x, n/2);
    int halfpowsq = halfpow * halfpow ;
    if ((n%2) != 0) {
        halfpowsq = x *halfpowsq;
    } 
    return halfpowsq;
}

public static void removeDuplicate(String str, int idx, StringBuilder newstring,boolean map[]){
    if (idx==str.length()) {
        System.out.println(newstring);
        return;
    }
    char currchar=str.charAt(idx);
    if (map[currchar - 'a'] == true) {
        // Duplicate
        removeDuplicate(str, idx+1, newstring, map);
    }else{
        map[currchar - 'a'] = true;
        removeDuplicate(str, idx+1, newstring.append(currchar), map);
    }
}

public static int parring(int people){
    if (people==1 || people==2) {
        return people;
    }
    
    // single
    int single=parring(people-1);
    // pair
    int pair= single*parring(people-2);
    // totalways
    int totalways=single+pair;
    return totalways;
}

public static void printbinString(int n, int lastplace, String s){
   if (n==0) {
    System.out.println(s);
    return;
   }
   
    if (lastplace==0) {
        printbinString(n-1, 0, s+"0");
        printbinString(n-1, 1, s+"1");
    }else{
        printbinString(n-1, 0, s+"0");
    }
} 
    public static void main(String args[]){
        // int num =10;
        // dec(num);
        // System.out.println(" ");
        // inc(num);
        // System.out.println(fac(5));
        // System.out.println(calsum(5));
        // System.out.println(fib(6));
        // int arr[]={1,2,3,4,5};
        // System.out.println(sorted(arr, 0));
        // int arr[]={2,4,7,9,5,2,10,11,5};
        // int key = 5;
        // System.out.println(lastOcc(arr, key, 0));
        // System.out.println(oppower(2, 10));
        // String str="rushabh";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(parring(3));
        printbinString(3, 0, "");
    }    
}
