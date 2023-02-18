
abstract class Parent2 {
    public Parent2(){
        System.out.println("I am Parent2 class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2 {
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class Child3 extends Parent2 {
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.greet();

        Parent2 p2 = new Parent2() {
            @Override
            public void greet() {
                System.out.println("Parent 2 object");
            }
        };

    }
}
