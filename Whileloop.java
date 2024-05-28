import java.util.*;

public class Whileloop {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int counter=sc.nextInt();
    //     int a=1;

    //     while (a<=counter) {
    //         System.out.print(a);
    //         a++;
    //     }
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int sum=0;
    //     int i=1;
    //     while (i<=n) {
    //         sum=sum+i;
    //         i++;
    //     }
    //     System.out.println("Sum is: " + sum);
    // }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();  

        while (num>0) { 
            int last = num%10;
            System.out.print(last);
            num=num/10;
        }

    }

}