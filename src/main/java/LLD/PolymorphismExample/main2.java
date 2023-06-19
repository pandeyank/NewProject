package LLD.PolymorphismExample;

public class main2 {
    public static void main(String[] args) {
        ICICI icici=new ICICI();
        System.out.println(icici.getInterest());
        icici.facility();

        System.out.println();

        Sbi sbi=new Sbi();
        System.out.println(sbi.getInterest());
        sbi.nameBank();

        System.out.println();
        Bank bank=new Bank();
        System.out.println(bank.getInterest());
        bank.country();


    }
}
