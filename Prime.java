import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        if (n==2) {
            System.out.println("Prime number");
        }
        else{
            boolean isprime= true;
        for(int i=2; i<=n-1; i++){
            if (n % i == 0) {
                isprime=false;
            }
        }
        if (isprime=true) {
            System.out.println("p");
        }
        else{
            System.out.println("Not");
        }
        }
    }    
}
