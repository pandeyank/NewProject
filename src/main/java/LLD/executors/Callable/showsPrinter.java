package LLD.executors.Callable;

import java.util.concurrent.Callable;

public class showsPrinter implements Callable {
    private String st;
    public showsPrinter(String x)
    {
        this.st=x;
    }
    public Object call() throws Exception
    {
        System.out.println("Shoes are :" +Thread.currentThread().getName() );
        return st;
    }
}
