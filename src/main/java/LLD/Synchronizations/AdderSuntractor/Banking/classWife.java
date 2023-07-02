package LLD.Synchronizations.AdderSuntractor.Banking;

public class classWife implements Runnable{
    private ClassAccount balance;
    public classWife(ClassAccount balance)
    {
        this.balance=balance;
    }
    public void run()
    {
       // synchronized (balance) {

            for (int i = 0; i < 100000; i++) {
                ClassAccount.balance += i;
            }
       // }
    }

}
