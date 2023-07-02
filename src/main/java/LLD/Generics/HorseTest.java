package LLD.Generics;

public class HorseTest {
    String name;
    int age;
    HorseTest(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return ("Hi I am Horse you can call me :" +name + " My age is:" +age);
    }
}
