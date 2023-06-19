package LLD.Interface;

public class Horse implements Animal{
    int a=12;
    public void eat()
    {
        System.out.println("Horse is eating");
    }
    public void sleep()
    {
        System.out.println("Horse is sleeping");
    }
    public void run()
    {
        System.out.println("Horse is running");
    }
    public void walk()
    {
        System.out.println("Horse is walking");
    }
    public void sound()
    {
        System.out.println("Horse is saying hing hing hing...");
    }
}
