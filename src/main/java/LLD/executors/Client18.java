package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client18 {
    public static void main(String[] args) {
        String[] arr={"Datak Chacha","Gautam","Dhoni","Bala ji","Pragati"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String s:arr)
        {
            printerJobImplementaion task=new printerJobImplementaion(s);
            executorService.execute(task);
        }
        executorService.shutdown();
    }


}
