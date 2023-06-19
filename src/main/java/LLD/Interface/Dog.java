package LLD.Interface;

public class Dog implements Animal{
    int a=122;
    public void eat()
    {
        System.out.println("Dog is eating");
    }
    public void run()
    {
        System.out.println("Dog is running");
    }
    public void walk()
    {
        System.out.println("Dog is walking");
    }
    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}
