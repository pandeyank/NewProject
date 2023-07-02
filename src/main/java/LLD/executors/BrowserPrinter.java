package LLD.executors;

public class BrowserPrinter implements Runnable{
    private String str;
    public BrowserPrinter(String p)
    {
        this.str=p;

    }
    public void run()
    {
        System.out.println(str +" enter in Browser: Welcome " +Thread.currentThread().getName());
    }
}
