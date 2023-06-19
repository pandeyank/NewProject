package LLD.PolymorphismExample;

public class methodOverloadingExample {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));

    }
}
