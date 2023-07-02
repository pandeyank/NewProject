package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client3 {
    public static void main(String[] args) {
        String[] name={"Datak Chacha","Yuvraj","Virat","Chacha","Dhoni"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=0;i< name.length;i++)
        {
            TravelPrinter task=new TravelPrinter(name[i]);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
