package LLD.Synchronizations.AdderSuntractor.BankingDemo2;

public class AccountDanger implements Runnable {
    Account acc=new Account();
    public static void main(String[] args) {
        AccountDanger r=new AccountDanger();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.setName("John");
        t2.setName("Fred");
        t1.start();
        t2.start();


    }

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            makeWithdraw(10);
            if(acc.getBalance()<0)
            {
                System.out.println("Money is overdrawn: Sorry can't make transection:");
            }
        }

    }

    private synchronized void makeWithdraw(int i) {
        if(acc.getBalance()>=i)
        {
            System.out.println(Thread.currentThread().getName() +" is going to start the transections: ");
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            acc.withdraw(10);
            System.out.println(Thread.currentThread().getName() +" complete the transection: Thank you :" +acc.getBalance());

        }
        else {
            System.out.println(Thread.currentThread().getName() +" Not enough money in your account: "+acc.getBalance());
        }
    }
}
