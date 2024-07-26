public class OOPS {
    public static void main(String args[]){
        // Pen p1=new Pen();
        // p1.setcolour("Blue");
        // System.out.println(p1.getcolour());

        // p1.settip(50);
        // System.out.println(p1.gettip());

        // Bank myacc = new Bank();
        // myacc.username("Rushabh");
        // System.out.println(myacc.name);
        // myacc.name = "Rushabh";
        // myacc.setpass("asdisa231");
        Pencil p1 = new Pencil("red");
        Pencil p2 = new Pencil();
        p2.colour="red";
        p2.point=13;
        p2.type[0]= "circle";
        p2.type[1]= "square";
        p2.type[2]= "rec";
        Pencil p3 = new Pencil(12);
        Pencil p4 = new Pencil(p2);
        p2.type[2]= "pentagon";
        for(int i=0; i<3; i++){
            System.out.println(p4.type[i]);
        }
    }
}
class Pencil{
    String colour;
    int point;
    String type[];
    
    // peremeterized constructor
    Pencil(String colour){
        type = new String[3];
        this.colour=colour;
    }
    // non perameterized constructor
    Pencil(){
        type= new String[3];
        System.out.println("Constructor");
    }
    // peremeterized constructor
    Pencil(int point){
        type= new String[3];
        this.point=point;
    }
    // Copy constructor
    Pencil(Pencil p2){
        type=new String[3];
        this.colour=p2.colour;
        this.point=p2.point;
        this.type=p2.type;
    }
}


class Pen{
    private String colour;
    private int tip;
    
    // 
    String getcolour(){
        return colour;
    }
    void setcolour(String newcolour){
        this.colour=newcolour;
    }
    
    // 
    int gettip(){
        return tip;
    }
    void settip(int newtip){
        tip=newtip;
    }
}

class Bank{
    public String name;
    private String password;

    public void setpass(String pass){
        password=pass;
    }

    public void username(String uname){
        name=uname;
    }

}



