package LLD.executors.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] shoe={"Adidas","Reebok","Puma","Aqualite","Paragon","Bata"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (String s:shoe)
        {
            showsPrinter task=new showsPrinter(s);
            Future f=executorService.submit(task);
            System.out.println(f.get());

        }
        executorService.shutdown();
    }
}
