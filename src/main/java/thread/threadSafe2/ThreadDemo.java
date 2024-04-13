package thread.threadSafe2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr, "售票处1");
        Thread t2 = new Thread(mr, "售票处2");
        Thread t3 = new Thread(mr, "售票处3");

        t1.start();
        t2.start();
        t3.start();

    }


}
