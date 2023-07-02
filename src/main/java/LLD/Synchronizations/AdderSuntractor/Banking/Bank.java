package LLD.Synchronizations.AdderSuntractor.Banking;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        ClassAccount ca = new ClassAccount();
        classHusband ch = new classHusband(ca);
        classWife cw = new classWife(ca);
        Thread t1 = new Thread(ch);
        Thread t2 = new Thread(cw);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ClassAccount.balance);

    }
}
