package thread.myThread;

import thread.threadMethod2.MyThread2;

public class myThreadTest {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("售票处1");
        t2.setName("售票处2");

        t1.start();
        t2.start();
    }


}
