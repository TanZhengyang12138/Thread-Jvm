package thread.myThread;

public class MyThread1 extends Thread {

    private static int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread1.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(300);
                        ticket--;
                        System.out.println(getName() + "售出一张票" + "还剩" + ticket + "张票");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
