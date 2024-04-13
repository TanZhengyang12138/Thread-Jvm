package thread.threadcase1;

public class ThreadDemo{

    public static void main(String[] args) {
        /**
         * 多线程的第一种实现方式
         * 1.自定义一个类继承Thread
         * 2.重写run方法
         * 3.创建子类的对象，并启动线程
         */
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread();
        t1.start();
        t2.setName("线程2");
        t2.start();
    }
}
