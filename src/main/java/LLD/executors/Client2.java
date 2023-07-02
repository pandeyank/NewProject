package LLD.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client2 {
    public static void main(String[] args) {
        //ArrayList<String> al= (ArrayList<String>) Arrays.asList("Aman","Shyam","Dhoni","Yuvraj","Virat");
        String[] arr={"Aman","Shyam","Dhoni","Virat","Yuvraj"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=0;i<arr.length;i++)
        {
            StringPrinter task=new StringPrinter(arr[i]);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
