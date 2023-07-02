package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client16 {
    public static void main(String[] args) {
        String[] name={"Varun","Datak Chacha","Dhoni","Gautam","Veeru","Yuvraj"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:name)
        {
            GharPahuchoPrinter task=new GharPahuchoPrinter(str);
            executorService.execute(task);
            //executorService.submit(task);
        }
        executorService.shutdown();
    }
}
