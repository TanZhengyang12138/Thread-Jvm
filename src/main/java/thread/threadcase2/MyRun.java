package thread.threadcase2;

public class MyRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取当前的线程对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "hd");
        }

    }
}
