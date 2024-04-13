package thread.threadSafe1;

public class MyThread extends Thread {

    static Integer ticket = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "卖出第" + ticket + "张票！！！");
                    ticket++;
                } else {
                    break;
                }
            }
        }
    }
}
