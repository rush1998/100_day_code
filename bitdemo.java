public class bitdemo {
    public static void oddeve(int num){
        if ((num & 1)==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void getbit(int num, int i){
        int bitmas=1<<i;
        if ((num & bitmas)==0) {
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void setbit(int num, int i){
        int bitmas=1<<i;
        int ans=num | bitmas;
        System.out.println(ans);
    }
    public static void clearbit(int num, int i){
        int bitmas= ~(1<<i);
        int ans = num & bitmas;
        System.out.println(ans); 
    }
    public static void clear(int num, int i, int newbit){
        if ((newbit) == 0) {
            clearbit(num, i);
        }else{
            setbit(num, i);
        }
    }
    public static void clearlast(int num, int i){
        int bitmas=-1<<i;
        int ans = num & bitmas;
        System.out.println(ans);
    }
    public static void clrange(int num, int i, int j){
        int a=(-1<<(j+1));
        int b=((1<<i)-1);
        int ab=a|b;

        int ans = num&ab;
        System.out.println(ans);
    }
    public static boolean twopower(int num){
        return (num&(num-1)) == 0;
    }
    public static int countsetbits(int num){
        int count=0;

        while (num>0) {
            if ((num&1) != 0) {
                count ++;
            }
            num=num >> 1;
        }
        return count;
    }
    public static int fastexp(int a, int num){
        int ans=1;
        while (num>0) {
            if ((num&1)!=0) {
                ans = ans*a;
            }
            a=a*a;
            num=num>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        // oddeve(5);
        // oddeve(4);
        // getbit(4, 2);
        // setbit(10, 2);
        // clearbit(10, 1);
        // clear(10, 1, 0);
        // clearlast(15, 2);
        // clrange(10, 2, 4);
        // System.out.println(twopower(4));
    //    System.out.println(countsetbits(15));
    System.out.println(fastexp(3, 5));
    }
 }
