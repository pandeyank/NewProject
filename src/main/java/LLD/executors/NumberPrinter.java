package LLD.executors;

public class NumberPrinter implements Runnable{
    private int num;
    public NumberPrinter(int x)
    {
        this.num=x;
    }
    public void run()
    {
        System.out.println(num + " from thread:" + Thread.currentThread().getName());
    }
}
