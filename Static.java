public class Static {
    public static void main(String args[]){
        School s= new School();
        
        s.setname("Rush");
        System.out.println(s.getname());
       
        s.schoolname = "hmb";
        System.out.println(s.schoolname);

        School s2 = new School();
        // s.schoolname = "jhb";
        System.out.println(s.schoolname);
    }
}

class School{
    int rollno;
    String name;

    static String schoolname;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
}