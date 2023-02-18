

class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am constructor");
    }
}

class Derived extends Base {
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // Case 1
        Base b = new Base();
        b.setX(40);
        System.out.println(b.x);

        // Case 2
        Derived c = new Derived();
        c.setX(45);
        System.out.println(c.getX());

        // Case 3
//        b.setY();
    }
}
