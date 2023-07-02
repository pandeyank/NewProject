package LLD.Synchronizations.AdderSuntractor.BankingDemo1;

public class BankMAin {
    public static void main(String[] args) throws InterruptedException {
        AccountDemo ad=new AccountDemo();
        CompanyA ca=new CompanyA(ad);
        CompanyB cb=new CompanyB(ad);
        Thread t1=new Thread(ca);
        Thread t2=new Thread(cb);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(AccountDemo.balance);
    }
}
