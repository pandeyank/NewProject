package LLD.executors;

public class GharPahuchoPrinter implements Runnable{
    private String str;
    public GharPahuchoPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Ghar pahucha Gaila bhai : Badhiya Ba " +Thread.currentThread().getName() );
    }
}
