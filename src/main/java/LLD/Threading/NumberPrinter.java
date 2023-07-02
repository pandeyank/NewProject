package LLD.Threading;

public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int m)
    {
        number=m;
    }

    public void run()
        {
            System.out.println(number + " From thread " + Thread.currentThread().getName());
        }

}
