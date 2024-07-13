import java.util.*;

public class substr {
    public static String substring(String str, int st, int end){
        String sub="";
        for(int i=st; i<end; i++){
            sub+=str.charAt(i);
        }
        return sub;
    } 
    public static void main(String args[]){
        String str="Helloworld";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str, 0, 5));
    }     
}
