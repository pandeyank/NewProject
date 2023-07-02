package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client12 {
    public static void main(String[] args) {
        String[] temple={"Badrinath","KedarNath","Vishwanath Dham","Haridwar","Ayodhya","Himalaya","Kashi Viswanath","Har Ki pauri"};
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(String str:temple)
        {
            TempleTourPrinter task=new TempleTourPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
