package LLD.executors.Callable;

import java.util.concurrent.Callable;

public class NamePrinter implements Callable{
    private String name;
    public NamePrinter(String x)
    {
        this.name=x;
    }
    public Object call() throws Exception
    {
        System.out.println(name +" ..Job Started:" +Thread.currentThread().getName());
        Thread.sleep(5000);
        return name;
    }

}
