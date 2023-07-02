package LLD.Synchronizations.AdderSuntractor.SumMinusDemo;

public class Minus implements Runnable {
    private value num;
    public Minus(value num)
    {
        this.num=num;
    }
    public void run()
    {
        for(int i=0;i<100000;i++)
        {
            synchronized (num) {
                num.num -= i;
            }
        }
    }

}
