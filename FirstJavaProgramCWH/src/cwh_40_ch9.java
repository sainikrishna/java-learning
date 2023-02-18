
class MyEmployee {
    private int id;
    private String name;

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

public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee em = new MyEmployee();
        // em.id = 40;
        // em.name = "Krishan"; => Throws error due to private access modifier
        em.setName("Krishan");
        em.setId(40);
        System.out.println("My employee name is: " + em.getName() + " and " + "id is " + em.getId());
    }
}
