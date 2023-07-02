package LLD.Threading;

public class NumberPrinter2 implements Runnable {
    private int num;
    public NumberPrinter2(int num)
    {
        this.num=num;
    }
    public void run()
    {
        System.out.println(num + " Thread is :" +Thread.currentThread().getName());
    }

}
