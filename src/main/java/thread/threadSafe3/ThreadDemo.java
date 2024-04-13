package thread.threadSafe3;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("售票处1");
        t2.setName("售票处2");
        t3.setName("售票处3");

        t1.start();
        t2.start();
        t3.start();
    }
}
