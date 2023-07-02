package LLD.executors;

public class RailwayTicketPrinter implements Runnable{
    private String str;
    public RailwayTicketPrinter(String x)
    {
        this.str=x;
    }
    public void run()
    {
        System.out.println(str +" Booked Ticket: Thank You for Travelling :" +Thread.currentThread().getName());
    }
}
