package LLD.Generics;

public class BobTest {
    String name;
    int size;
    BobTest(String name,int size)
    {
        this.name=name;
        this.size=size;
    }
    public String toString()
    {
        return ("Hi I am Bob you can call me " +name +" My shoe size is: " +size );
    }
}
