import java.util.*;

public class Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a>18) {
            System.out.println("Adult");
        }
        else if (a>12 && a<20 ) {
            System.out.println("Teenagers");
        }
        else{
            System.out.println("Kids");
        }
       }
}
