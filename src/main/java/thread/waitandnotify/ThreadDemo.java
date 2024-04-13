package thread.waitandnotify;

public class ThreadDemo {

    public static void main(String[] args) {

        /**
         * 完成生产者和消费者（等待唤醒机制）的代码
         * 实现线程轮流交替执行的效果
         */

        Foodie f = new Foodie();
        Cook c = new Cook();

        f.setName("厨师");
        c.setName("客人");

        f.start();
        c.start();

    }

}
