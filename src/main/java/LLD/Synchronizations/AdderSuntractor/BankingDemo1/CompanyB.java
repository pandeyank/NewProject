package LLD.Synchronizations.AdderSuntractor.BankingDemo1;

public class CompanyB implements Runnable{
    private AccountDemo balance;
    public CompanyB(AccountDemo balance)
    {
        this.balance=balance;
    }
    public void run()
    {
        synchronized (balance) {
            for (int i = 1; i < 1000; i++) {
                AccountDemo.balance += i;
            }
        }
    }
}
