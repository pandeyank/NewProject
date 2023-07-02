package LLD.Threading;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!" +Thread.currentThread().getName());
        doSomething();
    }

    private static void doSomething() {
        System.out.println("doSomething:" +Thread.currentThread().getName());
    }
}
