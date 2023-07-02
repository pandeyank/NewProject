package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client7 {
    public static void main(String[] args) {
        String[] arr={"Datak Chacha","Aman","Gautam","Bala ji","Pragati","Mummy","Papa"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String s:arr)
        {
            HomePrinter task=new HomePrinter(s);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
