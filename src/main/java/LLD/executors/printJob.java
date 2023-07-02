package LLD.executors;

public class printJob implements Runnable{
    String name;
    printJob(String x)
    {
        this.name=x;
    }
    public void run()
    {
        System.out.println(name +"..Job Started by Thread:" +Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(name +" ..Job Completed :" +Thread.currentThread().getName());
    }
}
