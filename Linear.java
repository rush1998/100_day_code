import java.util.*;

public class Linear {
    public static int find(int number[], int key){
        for(int i=0; i<number.length; i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,5,22,44,66,21};
        int key = 44 ;
        
        int index = find(numbers, key);
        if (index== -1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Key index is: " + index);
        }
    }    
}
