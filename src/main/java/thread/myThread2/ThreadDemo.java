package thread.myThread2;

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("小a");
        t2.setName("小b");
        t3.setName("小c");
        t4.setName("小d");
        t5.setName("小e");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
