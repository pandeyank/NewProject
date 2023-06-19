package LLD;

public class Zoo {
    public String coolMethod()
    {
        return "wow baby";
    }
}
class Moo1 extends Zoo
{
    public void useMycool()
    {
        System.out.println("Zoo says " +this.coolMethod());
        Zoo z=new Zoo();
        System.out.println("Zoo says hi this is " +z.coolMethod());
    }

}
