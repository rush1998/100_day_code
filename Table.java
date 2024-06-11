import java.util.*;

public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;

        for(int x=1; x<=10; x++){
            sum=num*x;
            System.out.println(sum);
        }
    }   
}
