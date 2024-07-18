import java.util.*;

public class stbuilder {
    public static void main(String args[]){
        StringBuilder st=new StringBuilder("");
        for(char i='A'; i<'Z'; i++){
            st.append(i);
        }
        System.out.println(st.length());
    }    
}
