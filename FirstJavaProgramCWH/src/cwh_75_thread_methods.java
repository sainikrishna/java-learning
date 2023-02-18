class MyNewThr1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thank you: " + this.getId());
        int i = 0;
        while (i < 40) {
            System.out.println("I am thread " + this.getId());
            i++;
        }
    }
}

class MyNewThr2 extends Thread {
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

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();

        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
