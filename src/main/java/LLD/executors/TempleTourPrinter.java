package LLD.executors;

public class TempleTourPrinter implements Runnable{
    private String str;
    public TempleTourPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" visiting temple: Thank You Visit Next time :" +Thread.currentThread().getName());
    }
}
