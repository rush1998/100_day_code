import java.util.*;

public class Addoddeven {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();
        int i=0;
        int y=0;
        for(int z=0;z<num;z++){
            if (num%2==0) {
                i=i+num;
            }else{
                y=y+num;
            }
        }
        System.out.println("Sum of even numbers is:" +i);
        System.out.println("Sum of odd nmbers is:" + y);
    }    
}
