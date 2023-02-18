
class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("I am thread");
            i++;
        }
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr myThread1 = new MyThr("Harry");
        System.out.println("The id of the myThread1 is: " + myThread1.getId());
        myThread1.start();
    }
}
