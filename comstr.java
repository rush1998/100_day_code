import java.util.*;
public class comstr {
    public static String compress(String str){
        StringBuilder sc = new StringBuilder("");
        for(int i=0; i<str.length();i++){
            int count=1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                i++;
                count++;
            }
            sc.append(str.charAt(i));
            if (count>1) {
                sc.append(count);
            }
        }
        return sc.toString();
    }
    public static void main(String args[]){
        String str="abc";
        System.out.println(compress(str));
    }
}
