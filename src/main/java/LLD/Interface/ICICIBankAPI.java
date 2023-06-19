package LLD.Interface;

public class ICICIBankAPI implements BankAPI{
    public int getBalance()
    {
        System.out.println("ICICI getBalance method API");
        return 100;
    }
    public void debit()
    {
        System.out.println("ICICI Bank debit method");
    }
    public void credit()
    {
        System.out.println("ICICI Bank credit method");
    }
}
