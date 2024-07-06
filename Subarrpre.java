import java.util.*;

public class Subarrpre {
    public static void prefix(int a[]){
        int pre[] = new int[a.length];
        int max= Integer.MIN_VALUE;

        pre[0]=a[0];
        for(int i=1; i<pre.length; i++){
            pre[i]=pre[i-1]+a[i];
        }

        for(int j=0; j<a.length; j++){
            for(int k=j; k<a.length; k++){
                int sum=0;
                // for(int l=j; l<=k; l++){
                //     System.out.print(a[l]);
                    
                // }
                sum= j==0? pre[j]:pre[k]-pre[j-1];

                    if (max<sum) {
                        max=sum;
                    }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("max: " + max);
    }
    public static void main(String args[]){
        int a[] = {1,-2,6,-1,3};

        prefix(a);

    }    
}
