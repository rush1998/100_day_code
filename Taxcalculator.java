import java.util.*;
public class Taxcalculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int income=sc.nextInt();
    double tax;
    if (income<=500000){
        System.out.println("No tax");
    }
    else if(income>500001 && income<=1000000){
        System.out.println(tax= income*(0.2));
    }
    else{
        System.out.println(tax= income*(0.3));
    }
}

}
    