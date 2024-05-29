import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Ans: ");

        switch (op) {
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default: System.out.println("Error");
                break;
        }
    }
}
