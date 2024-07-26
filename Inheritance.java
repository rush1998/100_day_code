public class Inheritance {
    public static void main(String args[]){
        // Fish shark = new Fish();

        // shark.eat();
        Aquaticbirds penguins = new Aquaticbirds();

        penguins.swim();
        penguins.skinclr = "blk and white";
        System.out.println(penguins.skinclr);
        
    }    
}

// Parent
class Animal{
    String skinclr;

    void eat(){
        System.out.println("Eat food.");
    }

    void sleep(){
        System.out.println("Sleep");
    }
}

// child (Hierarchial level)
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in water");
    }
}

// Multi level inheritance
class Aquaticbirds extends Fish{
    int legs;

    void hands(){
        System.out.println("Hands to swim");
    }
}

// Hierarchial level
class Mammals extends Animal{

    void walk(){
        System.out.println("Walk");
    }
}