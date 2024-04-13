package JVM.problem;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("A");
        new Demo1();
        new Demo1();
    }


    public Demo1(){
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }
}
