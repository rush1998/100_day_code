public class Abstract {
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.haslegs();
       System.out.println(h1.colour);
       
    }
}

abstract class Animal{
    String colour;
    Animal(){
        colour="brown";
    }

    void eat(){
        System.out.println("Can eat food");
    }

    abstract void haslegs();
}

class Horse extends Animal{
    void changecolour(){
        colour="black";
    }
    void haslegs(){
        System.out.println("4 legs");
    }
}

