package thread.waitandnotify;

public class Cook extends Thread{

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                } else {
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 1){
                        try {
                            //有则等待
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else {
                        //没有则做一碗面条
                        System.out.println("厨师做了一碗面条");
                        //修改桌子转态
                        Desk.foodFlag = 1;
                        //叫醒等待的客人开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
