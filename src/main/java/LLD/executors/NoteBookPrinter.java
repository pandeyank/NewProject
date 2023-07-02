package LLD.executors;

public class NoteBookPrinter implements Runnable{
    private String str;
    public NoteBookPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" buying copy Thanks:" +Thread.currentThread().getName());
    }

}
