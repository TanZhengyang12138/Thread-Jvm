package thread.threadMethod1;

public class ThreadDemo {

    public static void main(String[] args) {
        MyRun my = new MyRun();
        Thread t1 = new Thread(my, "aa");
        Thread t2 = new Thread(my, "bb");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }

}
