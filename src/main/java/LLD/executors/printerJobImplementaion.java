package LLD.executors;

public class printerJobImplementaion implements Runnable{
    private String str;
    printerJobImplementaion(String x)
    {
        this.str=x;
    }
    public void run()
    {
        System.out.println(str +"...Job Started: " +Thread.currentThread().getName());
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(str + "..Job completed Thanks: "+Thread.currentThread().getName());
    }
}
