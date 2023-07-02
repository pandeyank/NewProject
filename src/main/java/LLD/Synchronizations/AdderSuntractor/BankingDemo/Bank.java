package LLD.Synchronizations.AdderSuntractor.BankingDemo;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        Money money = new Money();
        ICICI icici = new ICICI(money);
        SBI sbi = new SBI(money);
        Thread t1 = new Thread(icici);
        Thread t2 = new Thread(sbi);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Money.balance);
    }
}
