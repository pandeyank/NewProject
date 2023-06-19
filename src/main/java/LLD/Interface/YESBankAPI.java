package LLD.Interface;

public class YESBankAPI implements BankAPI{
    public int getBalance()
    {
        System.out.println("Yes Bank getBalance API");
        return 1;
    }
    public void debit()
    {
        System.out.println("Yes Bank debit method");
    }
    public void credit()
    {
        System.out.println("Yes Bank credit method");
    }
}
