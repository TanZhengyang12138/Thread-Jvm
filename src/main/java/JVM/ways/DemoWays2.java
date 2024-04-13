package JVM.ways;

import JVM.Demo;

public class DemoWays2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("JVM.ways.DemoWays");
    }

}


class DemoWays{
    static {
        System.out.println("DemoWays初始化了");
    }
}
