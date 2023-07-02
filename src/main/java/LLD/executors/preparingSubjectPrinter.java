package LLD.executors;

public class preparingSubjectPrinter implements Runnable{
    private String str;
    public preparingSubjectPrinter(String str)
    {
        this.str=str;
    }
    public void run()
    {
        System.out.println(str +" Subject Prepared :Thank you:" +Thread.currentThread().getName());
    }

}
