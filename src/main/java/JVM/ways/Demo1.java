package JVM.ways;

public class Demo1 {
    public static void main(String[] args) {
        int i = Demo2.i;
        System.out.println(i);
    }

}
class Demo2{
    static {
        System.out.println("Demo2初始化了...");
    }
    public static final int i = 1;
}