package LLD.PolymorphismExample;

public class main4 {
    public static void main(String[] args) {
        rectangle rc=new rectangle();
        System.out.println(rc.area());
        System.out.println();
        square sq=new square();
        System.out.println(sq.area());
        System.out.println();
        rectangle rc1=new square();
        System.out.println(rc1.area());

    }
}
