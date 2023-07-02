package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client9 {
    public static void main(String[] args) {
        String[] arr={"Diwali","Raksha Bandhan","Holi","Shivratri","Navratri","Dashara","Hanuman Jayanti"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:arr)
        {
            FestivalPrinter task=new FestivalPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
