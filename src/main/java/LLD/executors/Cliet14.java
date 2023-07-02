package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cliet14 {
    public static void main(String[] args) {
        String[] Socity={"GK Meadows","Green Meadows","Swastik","Navami","Aaradjya","Mohini","Saundarya"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:Socity)
        {
            purchasingFlatPrinter task=new purchasingFlatPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
