package LLD.Generics;

public class MppfTest {
    public static void main(String[] args) {
        Moof m=new Moof(8);
        Moof n=new Moof(8);
        if(m.equals(n))
        {
            System.out.println("both are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
