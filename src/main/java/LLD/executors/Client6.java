package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client6 {
    public static void main(String[] args) {
        String[] arr={"Datak Chacha","Dhoni","Balaji","Yuvraj","Gautam"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:arr)
        {
            RailwayTicketPrinter task=new RailwayTicketPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
