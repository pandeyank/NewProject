package LLD.executors;

public class HomePrinter implements Runnable{
    private String str;
    public HomePrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Reached Home: Ballia Thank You :" +Thread.currentThread().getName());
    }
}
