package LLD.PolymorphismExample.Constructor;

public class Client {
    public static void main(String[] args) {
        classD d=new classD();
        System.out.println();
        classB b=new classB();
        System.out.println();
        classA c=new classC();
        System.out.println();
        classA a=new classD();

    }
}
