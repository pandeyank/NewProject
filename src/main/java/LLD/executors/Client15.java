package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client15 {
    public static void main(String[] args) {
        String[] notebook={"classmate","Jyoti","Mohit","Veeru","Matrics","yulu"};
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(String str:notebook)
        {
            NoteBookPrinter task=new NoteBookPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
