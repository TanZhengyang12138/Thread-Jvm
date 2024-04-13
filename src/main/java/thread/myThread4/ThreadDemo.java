package thread.myThread4;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 50, 100, 200, 300, 200, 800, 100, 2);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

    }

}
