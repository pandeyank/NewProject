package LLD.PolymorphismExample;

public class ovveridingmain {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.printHello();

        child c=new child();
        c.printHello();

        Parent p1=new child();
        p1.printHello();

        //child c1= (child) new Parent();
        //c1.printHello();

    }
}
