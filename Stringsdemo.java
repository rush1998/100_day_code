import java.util.*;
public class Stringsdemo {
    public static void str(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        String st = "abd";

        // Scanner sc = new Scanner(System.in);
        // String str= sc.nextLine();
        // System.out.println(str.length());
        String fname= "Rushabh";
        String Lname= "Patel";
        String name= fname + Lname;
        // System.out.println(name);
            
        str(name);
    }
}
