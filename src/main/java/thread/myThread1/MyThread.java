package thread.myThread1;

public class MyThread extends Thread {

    static int count = 0;

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                synchronized (MyThread.class) {
                    if (i % 2 == 1 && i > count){
                        count = i;
                        System.out.println(getName() + count);
                    }
                }
            }
        }
    }
}
