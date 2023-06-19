package LLD.Interface;

public class main2 {
    public static void main(String[] args) {
        classC c=new classC();
        c.methodOne();
        System.out.println(c.num);

        interfaceA x=new classC();
        System.out.println(x.num);

        interfaceB y=new classC();
        System.out.println(y.num);
    }
}
