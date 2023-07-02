package LLD.executors;

public class FestivalPrinter implements Runnable {
    private String str;
    public FestivalPrinter(String s)
    {
        this.str=s;
    }
    public void run()
    {
        System.out.println(str +" Festival: Congratulations to enjoy :" +Thread.currentThread().getName());
    }

}
