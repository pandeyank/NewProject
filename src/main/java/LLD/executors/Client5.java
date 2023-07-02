package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client5 {
    public static void main(String[] args) {
        String[] arr={"Pulsar","Hero Honda","Bajaj Platina","Harley Davidson","Bullet","Royal Enfield"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String s:arr)
        {
            BikePurchasePrinter task=new BikePurchasePrinter(s);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
