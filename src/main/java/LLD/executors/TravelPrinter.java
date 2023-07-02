package LLD.executors;

public class TravelPrinter implements Runnable{
    private String name;
    public TravelPrinter(String x)
    {
        this.name=x;
    }
    public void run()
    {
        System.out.println(name +" Reached Home Thank You for Visit:" +Thread.currentThread().getName());
    }
}
