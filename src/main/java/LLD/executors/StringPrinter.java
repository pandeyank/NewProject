package LLD.executors;

public class StringPrinter implements Runnable{
    private String str;
    public StringPrinter(String s)
    {
        this.str=s;
    }
    public void run()
    {
        System.out.println(str +" Hi How are you" +Thread.currentThread().getName());
    }


}
