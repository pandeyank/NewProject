package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorJob {
    public static void main(String[] args) {
        String[] arr={"Durga","Yuvraj","Dhoni","Aman","Shyam","Datak Chacha"};
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(String str:arr)
        {
            printJob task=new printJob(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
