package LLD.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++)
        {
            NumberPrinter task=new NumberPrinter(i);
            executorService.execute(task);
            /*if(i==5 || i==11 || i==20)
            {
                System.out.println("Debug");
            }*/
        }
        executorService.shutdown();
    }
}
