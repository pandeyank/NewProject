package LLD.Synchronizations.AdderSuntractor.BankingDemo;

public class ICICI implements Runnable{
    private Money balance;
    public ICICI(Money balance)
    {
        this.balance=balance;
    }
    public void run()
    {
       // synchronized (balance) {
            for (int i = 1; i < 100000; i++) {
                Money.balance += i;
            }
        //}
    }
}
