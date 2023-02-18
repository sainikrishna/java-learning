class Base1 {
    public int x;

    Base1(){
        System.out.println("I am Base1 class constructor");
    }
    Base1(int a){
        System.out.println("I am Overloaded constructor with a: " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    public int y;

    Derived1(){
//        super(40);
        System.out.println("I am Derived1 class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am Overloaded constructr of Derived1 class with value x: " + x + " and y: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived1 {
    int z;

    ChildOfDerived(){
        System.out.println("I am child of derived class constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am overloaded child of derived class constructor with values x, y and x");
    }
}

public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Derived1 d = new Derived1();
//        Derived1 d1 = new Derived1(20, 33);
        ChildOfDerived cd = new ChildOfDerived(20, 33, 12);
    }
}
