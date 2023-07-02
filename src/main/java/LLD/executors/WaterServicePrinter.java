package LLD.executors;

public class WaterServicePrinter implements Runnable{
    private String str;
    public WaterServicePrinter(String str)
    {
        this.str=str;
    }

    public void run()
    {
        System.out.println(str +" Thank You for Service:" +Thread.currentThread().getName());
    }
}
