
class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
        System.out.println("I am thread 1 not a threat 1");
    }
}

class MyRunnableThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
        System.out.println("I am thread 2 not a threat 2");
    }
}

public class cwh_71_runnable {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
