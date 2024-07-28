public class Interface{
    public static void main (String args[]){
        Queen q = new Queen();
        
        q.move();

        Beer b= new Beer();
        b.eatsplants();
        b.eatsmeat();
    }
}

interface Herbi{
    void eatsplants();
}

interface Carni{
    void eatsmeat();
}

class Beer implements Herbi, Carni{
    public void eatsplants(){
        System.out.println("Eats plants");
    }
    public void eatsmeat(){
        System.out.println("Eats meat");
    }
}




interface Chess{
    void move();
}

class Rook implements Chess{
    public void move(){
        System.out.println("forward, backward or sideways");
    }
}

class Queen implements Chess{
    public void move(){
        System.out.println("up, down, left, right, or diagonal");
    }
}

class King implements Chess{
    public void move(){
        System.out.println("horizontally, vertically, or diagonally");
    }
}