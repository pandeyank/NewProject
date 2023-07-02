package LLD.Synchronizations.AdderSuntractor.ADDSUBDemo;

public class Subtractor implements Runnable{
    private Count y;
    public Subtractor(Count y)
    {
        this.y=y;

    }

    public void run()
    {

        for(int i=1;i<=100000;i++)
        {

                y.val-=i;

            //System.out.println("Bye");
        }

    }
}
