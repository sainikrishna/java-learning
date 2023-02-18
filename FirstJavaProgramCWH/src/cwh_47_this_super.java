class EkClass {
    int a;

    EkClass(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(34);
        System.out.println(e.getA());
    }
}
