package LLD.executors;

public class purchasingFlatPrinter implements Runnable{
    private String str;
    public purchasingFlatPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Thanks for Purchasing House: " +Thread.currentThread().getName());
    }

}
