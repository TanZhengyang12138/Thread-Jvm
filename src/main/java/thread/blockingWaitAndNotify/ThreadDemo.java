package thread.blockingWaitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {

    public static void main(String[] args) {

        /**
         * 利用阻塞队列实现生产者和消费者（等待唤醒机制）的代码
         */

        //创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //创建线程的对象，并把阻塞队列对象传过去
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        //开启线程
        cook.start();
        foodie.start();
    }

}
