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

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r= sc.nextInt();
        System.out.println(bico(n,r));
    }
}
