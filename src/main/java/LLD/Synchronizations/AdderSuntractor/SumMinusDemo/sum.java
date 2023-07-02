package LLD.Synchronizations.AdderSuntractor.SumMinusDemo;

public class sum implements Runnable {
    private value num;
    public sum(value num)
    {
        this.num=num;
    }
    public void run()
    {
        for(int i=0;i<100000;i++)
        {
            synchronized (num) {
                num.num += i;
            }
        }
    }

}
