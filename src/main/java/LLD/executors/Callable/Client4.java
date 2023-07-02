package LLD.executors.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] arr={"Sachine","Yuvraj","Dhoni","Kohli","Hardik","Manoj","Kapil"};
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        for(String str:arr)
        {
            NamePrinter task=new NamePrinter(str);
            Future f=executorService.submit(task);
            System.out.println(f.get());
        }
        executorService.shutdown();
    }
}
