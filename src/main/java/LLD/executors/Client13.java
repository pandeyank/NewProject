package LLD.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client13 {
    public static void main(String[] args) {
        String[] fan={"Bajaj","Sansui","Usha","Polar","Havels","Onida"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:fan)
        {
            purchasingFanPrinter task=new purchasingFanPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();

    }
}
