package LLD.Threading;

public class client3 {
    public static void main(String[] args) {
        MyThread task=new MyThread();
        Thread t=new Thread(task);
        t.start();
        System.out.println("Main Method");
        System.out.println(Thread.currentThread().getName());

    }
}
