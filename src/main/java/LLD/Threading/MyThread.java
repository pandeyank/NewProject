package LLD.Threading;

public class MyThread implements Runnable {
    public void run()
    {
        System.out.println("This is the MyThread method:");
        System.out.println(Thread.currentThread().getName());
    }

}
