package LLD.executors.Callable;

import java.util.concurrent.Callable;

public class NaturalSumPrinter implements Callable {
    private int num;
    public NaturalSumPrinter(int x)
    {
        this.num=x;
    }
    public Object call() throws Exception
    {
        int sum=0;
        for(int i=0;i<num;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
