public class Tiling {
    public static int poss(int n){
        if (n==0 || n==1) {
            return 1;
        }
        
        // vertical
        int nm1=poss(n-1);
        // horizontal
        int nm2=poss(n-2);
        
        // total possibilities
        int total=nm1+nm2;
        return total;
    }
    public static void main(String args[]){
        System.out.println(poss(4));
    }
}
