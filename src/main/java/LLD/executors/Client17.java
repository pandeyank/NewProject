package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client17 {
    public static void main(String[] args) {
        Mythread task=new Mythread();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(task);
        executorService.shutdown();
        for(int i=0;i<100;i++)
        {
            System.out.println("Main Thread");
        }

    }
}
