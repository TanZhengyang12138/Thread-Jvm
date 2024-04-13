package thread.myThread5;

import thread.myThread4.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 50, 100, 200, 300, 200, 800, 100, 2);

        MyCallable mc = new MyCallable(list);

        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

        System.out.println(max1);
        System.out.println(max2);

    }

}
