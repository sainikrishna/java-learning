class A {
    public int a;

    public int krishan(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }

}

class B extends A {
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }
}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth3();
        b.meth2();
    }
}
