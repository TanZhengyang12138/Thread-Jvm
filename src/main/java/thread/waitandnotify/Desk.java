package thread.waitandnotify;

public class Desk {

    /**
     * 控制生产者和消费者执行
     */

    // 0: 没有面条 1: 有面条
    public static int foodFlag = 0;

    //总个数
    public static int count = 10;

    // 锁
    public static Object lock = new Object();

}
