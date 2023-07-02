package LLD.Synchronizations.AdderSuntractor.SumMinusDemo;

public class Client1 {
    public static void main(String[] args) throws InterruptedException {
        value v=new value();
        sum s=new sum(v);
        Minus m=new Minus(v);
        Thread t1=new Thread(s);
        Thread t2=new Thread(m);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(v.num);

    }


}
