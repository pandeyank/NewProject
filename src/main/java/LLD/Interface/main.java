package LLD.Interface;

public class main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.run();
        d.sleep();
        System.out.println(d.c);
        System.out.println(d.a);
        System.out.println();
        Horse h=new Horse();
        h.walk();
        h.eat();
        h.sound();
        h.run();
        h.sleep();
        System.out.println(h.a);
        System.out.println(h.c);

        Animal a=new Dog();
        System.out.println(((Dog) a).a);

        Animal a1=new Horse();
        System.out.println(((Horse) a1).a);
    }
}
