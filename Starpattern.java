import java.util.*;

public class Starpattern {
    public static void main(String args[]){
        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=4;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=4;
        // for(int line=1; line<=n; line++){
        //     for(int num=1; num<=line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        int n=4;
        char ch='A';
        for(int line=1; line<=n; line++){
            for(int chara=1; chara<=line; chara++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }    
}
