package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client8 {
    public static void main(String[] args) {
        String[] arr={"Bisleri","Aquafina","Patajali","Belsari","Aqua","Dr Fixit","Kent"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String s:arr)
        {
            WaterServicePrinter task=new WaterServicePrinter(s);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
