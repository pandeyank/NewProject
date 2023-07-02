package LLD.executors;

public class TopperServicePrinter implements Runnable{
    private String str;
    public TopperServicePrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Topper in the University:" +Thread.currentThread().getName());
    }

}
