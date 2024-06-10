import java.util.*;

public class Break {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("Enter the number ");
            int num= sc.nextInt();
            if (num%10 == 0) {
                break;
            }
        }while(true);
        System.out.println("It is a multiple of 10");
    }
}
