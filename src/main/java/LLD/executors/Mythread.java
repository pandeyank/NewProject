package LLD.executors;

public class Mythread implements Runnable{

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Child Thread");
        }
    }

}
