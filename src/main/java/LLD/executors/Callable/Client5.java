package LLD.executors.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] fan={"Havells","USHA","Cromton","Indo","Asian","Polar"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (String s:fan)
        {
            FanPrinter task=new FanPrinter(s);
            Future f=executorService.submit(task);
            System.out.println(f.get());

        }
        executorService.shutdown();
    }
}
