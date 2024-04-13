package thread.myThread1;

import thread.myThread.MyThread1;

public class myThreadTest {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("1售票处");
        t2.setName("2售票处");

        t1.start();
        t2.start();
    }


}
