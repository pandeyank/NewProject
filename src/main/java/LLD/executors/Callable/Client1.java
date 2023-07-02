package LLD.executors.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* NaturalSumPrinter[] arr={new NaturalSumPrinter(10),
        new NaturalSumPrinter(20),
        new NaturalSumPrinter(30),
        new NaturalSumPrinter(40)};*/
        int[] arr={10,20,30,40};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=0;i<arr.length;i++)
        {
            NaturalSumPrinter task=new NaturalSumPrinter(arr[i]);
            Future f=executorService.submit(task);
            System.out.println(f.get());
        }
        executorService.shutdown();

    }
}
