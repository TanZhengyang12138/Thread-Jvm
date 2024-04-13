package JVM.problem;

public class Demo2 {

    public static void main(String[] args) {
        Test[] arr = new Test[10];
        System.out.println(arr[1]);
    }

}

class Test{
    static {
        System.out.println("Test初始化了");
    }
}
