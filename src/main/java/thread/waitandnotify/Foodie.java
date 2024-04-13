package thread.waitandnotify;

public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0){
                    break;
                } else {
                    //判断桌子上是否有面条
                    if (Desk.foodFlag == 0){
                        try {
                            //没有则等待
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //吃的总数减1
                        Desk.count --;
                        System.out.println("客人吃了一碗面条，还能吃" + Desk.count + "碗");
                        //叫醒厨师做面
                        Desk.lock.notifyAll();
                        //修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }

}
