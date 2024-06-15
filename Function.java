import java.util.*;

public class Function {
    public static void printhelloworld(){
        System.out.println("Hello");
    }
    public static int calculate(int a, int b){
        int sum= a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum = calculate(a,b);
        System.out.println("Sum is:" + sum);
    }
}
