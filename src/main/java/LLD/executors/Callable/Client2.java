package LLD.executors.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] a={10,20,30};
        int[] b={2,2,2};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (int i=0;i< a.length;i++)
        {
            calculatorPrinter task=new calculatorPrinter(a[i],b[i]);
            Future f=executorService.submit(task);
            System.out.println(f.get());
        }
        /*calculatorPrinter task=new calculatorPrinter(10,2);
        calculatorPrinter task1=new calculatorPrinter(20,2);
        calculatorPrinter task2=new calculatorPrinter(30,2);*/


       /* Future f1=executorService.submit(task);
        System.out.println(f1.get());
        Future f2=executorService.submit(task1);
        System.out.println(f2.get());
        Future f3=executorService.submit(task2);
        System.out.println(f3.get());*/

        executorService.shutdown();

    }


}
