package LLD.PolymorphismExample;

public class main3 {
    public static void main(String[] args) {
        classA obj1=new classA();
        System.out.println(obj1.a);
        obj1.print();
        System.out.println();

        classB obj2=new classB();
        System.out.println(obj2.a);
        obj2.print();
        System.out.println();

        classA obj3=new classB();
        System.out.println(obj3.a);
        obj3.print();

        /*classB obj4= (classB) new classA();
        System.out.println(obj4.a);*/           //----->not possible
    }
}
