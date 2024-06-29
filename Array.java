import java.util.*;

public class Array {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        // int marks[] = new int [50];
        // Scanner sc= new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("length is" + marks.length);
        // System.out.println("Phy " + marks[0]);
        // System.out.println("Chem " + marks[1]);
        // System.out.println("Math " + marks[2]);

        // marks[2] = 98;
        // System.out.println("Updated Math marks is " + marks[2]);

        // int per = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Per is " + per + "%");

        int marks[] = {98,99,89};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        
    }    
}
