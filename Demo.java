import java.util.*;

public class Demo {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       
       String type=(number%2 == 0)? "Even" : "Odd";
       System.out.println(type);
}
}