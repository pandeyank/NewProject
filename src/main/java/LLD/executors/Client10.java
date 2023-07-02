package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client10 {
    public static void main(String[] args) {
        String[] arr={"Dhoni","Virat","Gautam","Yuvraj","Parthiv","Sachin"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String s:arr)
        {
            TopperServicePrinter task=new TopperServicePrinter(s);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
