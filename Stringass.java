import java.util.*;

public class Stringass {
    public static void Que1(String str){
        int count=0;
        for(int j=0;j<str.length();j++){
       
        char ch=str.charAt(j);
        if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch =='u') {
            count++;
        }
       }
       System.out.println(count);
    }
    public static void que4(String st1, String st2){
        if (st1.length()==st2.length()) {
            char[] st1arr=st1.toCharArray();
            char[] st2arr=st2.toCharArray();

            Arrays.sort(st1arr);
            Arrays.sort(st2arr);

            boolean result = Arrays.equals(st1arr,st2arr);
            if (result) {
                System.out.print(st1 + " " + st2 + " are anagrams");
            }else{
                System.out.print(st1 + " " + st2 + " are not anagrams");
            }

        }else{
            System.out.print(st1 + " " + st2 + " are not anagrams");
        }
    }
    public static void main(String args[]){
        // String str=new String();
        // Scanner sc=new Scanner(System.in);
        // str=sc.nextLine();
        // Que1(str);
        String str1="fatss";
        String str2="heart";
        que4(str1, str2);
    }    
}
