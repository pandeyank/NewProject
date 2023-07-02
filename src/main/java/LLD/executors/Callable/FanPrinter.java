package LLD.executors.Callable;

import java.util.concurrent.Callable;

public class FanPrinter implements Callable {
    private String str;
    public FanPrinter(String x)
    {
        this.str=x;
    }
    public Object call() throws Exception
    {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
        return str;
    }
}
