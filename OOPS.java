public class OOPS {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolour("Blue");
        System.out.println(p1.getcolour());

        p1.settip(50);
        System.out.println(p1.gettip());

        // Bank myacc = new Bank();
        // myacc.username("Rushabh");
        // System.out.println(myacc.name);
        // myacc.name = "Rushabh";
        // myacc.setpass("asdisa231");
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



