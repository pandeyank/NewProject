package LLD.executors;

public class purchasingFanPrinter implements Runnable {
    private String str;
    public purchasingFanPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Thanks for purchasing: " +Thread.currentThread().getName());
    }

}
