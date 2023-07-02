package LLD.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client4 {
    public static void main(String[] args) {
        String[] arr={"Datak Chacha","Bala ji","Behan ji","Chacha","Munna"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (int i=0;i< arr.length;i++)
        {
            BrowserPrinter task=new BrowserPrinter(arr[i]);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
