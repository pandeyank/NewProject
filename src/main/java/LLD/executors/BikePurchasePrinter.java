package LLD.executors;

public class BikePurchasePrinter implements Runnable{
    private String str;
    public BikePurchasePrinter(String x)
    {
        this.str=x;
    }
    public void run()
    {
        System.out.println(str +" Bike Purchase: Thank you " +Thread.currentThread().getName());
    }
}
