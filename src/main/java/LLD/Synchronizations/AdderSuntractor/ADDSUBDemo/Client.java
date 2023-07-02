package LLD.Synchronizations.AdderSuntractor.ADDSUBDemo;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //int val=0;
        Count c=new Count();
        Adder adder=new Adder(c);
        Subtractor subtractor=new Subtractor(c);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.val);

    }

}
