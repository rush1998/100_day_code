import java.util.*;

public class Tr {
    public static int twater(int barheight[]){
        
        int leftmax[] = new int[barheight.length]; //Barheight.length = 7
        leftmax[0]=barheight[0];
        for(int i=1; i<barheight.length; i++){
            leftmax[i] = Math.max(barheight[i],leftmax[i-1]);
        }

        int rightmax[] = new int[barheight.length];
        rightmax[barheight.length-1]=barheight[barheight.length-1];  // Barheight.length = 7
        for(int i=barheight.length-2; i>=0; i--){
            rightmax[i] = Math.max(barheight[i], rightmax[i+1]);
        }

        int areawater= 0;
        for(int i=0; i<barheight.length; i++){
            areawater += Math.min(leftmax[i], rightmax[i]) - barheight[i];
        }
        return areawater;

    }
    public static void main(String args[]){
        int barheight[] = {4,2,0,3,2,5};   
        System.out.println(twater(barheight));
    }    
}
