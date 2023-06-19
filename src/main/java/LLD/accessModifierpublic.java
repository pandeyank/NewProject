package LLD;

public class accessModifierpublic {
    public String coolMethod()
    {
        return "wow baby";
    }
}
class Moo
{


    public void useAzoo()
    {
        accessModifierpublic am=new accessModifierpublic();
        System.out.print("Moo says hi " +am.coolMethod());
    }

}
