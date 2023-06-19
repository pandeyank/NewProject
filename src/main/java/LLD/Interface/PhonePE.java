package LLD.Interface;

public class PhonePE {
    public static void main(String[] args) {
        BankAPI api=new ICICIBankAPI();
        System.out.println(api.getBalance());
        api.credit();
        api.debit();
    }
}
