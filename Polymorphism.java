public class Polymorphism {
    public static void main(String args[]){
        Calculator cal =new Calculator();

        System.out.println(cal.add(2, 4));
        System.out.println(cal.add(4, 6, 7));

        Deer d= new Deer();
        d.eat();
    }
}

class Calculator{
    int add(int a, int b){
        return a+b; 
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void eat(){
        System.out.println("Eat food.");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass.");
    }
}