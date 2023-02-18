class MyThr1 extends Thread {
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thank you: " + this.getName());
        int i = 0;
        while (i < 40000) {
            System.out.println("I am thread " + this.getName());
            i++;
        }
    }
}

public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 most priority");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
