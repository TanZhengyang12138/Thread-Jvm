package JVM.ways;

public class DemoWays3 {

    static {
        System.out.println("DemoWays3初始化了");
    }

    public static void main(String[] args) {
        System.out.println("d");
        new Demo4();
    }

}


class Demo4{
    static {
        System.out.println("Demo4初始化了");
    }
    public Demo4(){
        System.out.println("4444");
    }
}
