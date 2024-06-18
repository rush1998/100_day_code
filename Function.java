import java.util.*;

public class Function {
    public static void printhelloworld(){
        System.out.println("Hello");
    }
    public static int calculate(int a, int b){
        int sum= a + b;
        return sum;
    }
    public static int multi(int a, int b){
        int sum=a*b;
        return sum;
    }
    public static int fact(int n){
        int f=1;
        for(int x=1; x<=n; x++){
            f=x*f;
        }
        return f;
    }
    public static int bico(int a, int b){
        int nf = fact(a);
        int rf = fact(b);
        int nmr = fact(a-b);

        int bc = nf/(rf*nmr);

        return bc;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static boolean isprime(int a){
        if (a==2) {
            return true;
        }
        for(int i=2; i<a-1; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primerange(int a){
        for(int i=2; i<=a; i++){
            if (isprime(i)) {
                System.out.print(i + " ");                
            }
        }
        System.out.println();
    }
    public static void bintodec(int a){
        int first=0;
        int pow = 0;
        while(a>0){
            int last= a%10;
            first = first + (last * (int) Math.pow(2,pow));
            
            pow++; 
            a=a/10;
        }
        System.out.print("Dec number is:" + first);
    }
    public static void dectobin(int a){
        int bin = 0;
        int pow=0;
        
        while (a>0) {
            int rem=a%2;
            bin=bin+(rem * (int)Math.pow(10, pow));
            pow++;
            a=a/2;            
        }
        System.out.println("Binary is: " + bin);
    }
    public static void main(String args[]){
        // Scanner sc =new Scanner(System.in);
        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // int add = calculate(a,b);
        // System.out.println("Sum is:" + add);

        // int a = 10;
        // int b =10;
        // int prod=multi(a, b);
        // System.out.println("Product is:" + prod);

        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int r= sc.nextInt();
        // System.out.println(bico(n,r));

        // System.out.println(sum(2,5));
        // System.out.println(sum(3,4,5));

        bintodec(11);
    }
}
