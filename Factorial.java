import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= sc.nextInt();
        int x=1;

        for(int y=1; y<=num; y++){
            x=x*y;
        }
        System.out.println("Factorial is:" + x);
    }    
}
