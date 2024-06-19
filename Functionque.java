import java.util.*;

public class Functionque {
    public static int avg(int a , int b, int c){
        return (a+b+c)/3;
    }
    public static void isEven(int a){
        if (a%2==0) {
            System.out.println("True");;
        }else{
            System.out.println("False");;
        }
    }
    public static boolean pal(int num){
        int rev=0;
        int backup= num;
       
        while (num>0) {
            rev = rev*10+ num%10;
            num=num/10;            
        }

        if (backup==rev) {
            return true;
        }else{
            return false;
        }
    }
    public static int sumofin(int a){
        int sum=0;

        while (a>0) {
           int last=a%10;
           sum=sum+last;
           a=a/10;
        }
        return sum;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter three numbers: ");
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();
        // System.out.println("The average is:" + avg(a, b, c));

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number: ");
        // int num= sc.nextInt();

        // if (pal(num)) {
        //     System.out.println(num + " is Palindriome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("The sum of the given number is:" + (sumofin(num)));
    }    
}
