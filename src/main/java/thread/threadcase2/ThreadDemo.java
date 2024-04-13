package thread.threadcase2;

public class ThreadDemo {

    public static void main(String[] args) {

        /**
         * 多线程的第二种实现方式
         * 1.自定义一个类实现Runnable接口
         * 2.重写里面的run方法
         * 3.创建自己的类对象
         * 4.创建一个Thread类的对象，并开启线程
         */
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun, "t1");
        Thread t2 = new Thread(myRun);

        t1.start();

        t2.setName("t2");
        t2.start();
    }

}
