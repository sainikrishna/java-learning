class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        name = "Krishan";
        id = 45;
    }
    public MyMainEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }

    public void setName(String na){
        name = na;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee em1 = new MyMainEmployee("Krishan ", 49);
        System.out.println(em1.getName());
        System.out.println(em1.getId());

        MyMainEmployee em2 = new MyMainEmployee();
        System.out.println(em2.getName());
        System.out.println(em2.getId());
    }
}
