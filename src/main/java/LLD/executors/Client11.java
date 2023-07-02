package LLD.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client11 {
    public static void main(String[] args) {
        String[] subject={"Algorithm","Data Structure","DataBase","TOC","Apptitude","Mathmatics"};
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(String str:subject)
        {
            preparingSubjectPrinter task=new preparingSubjectPrinter(str);
            executorService.execute(task);
        }
        executorService.shutdown();
    }

}
