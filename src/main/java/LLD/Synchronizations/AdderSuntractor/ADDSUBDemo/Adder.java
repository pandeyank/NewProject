package LLD.Synchronizations.AdderSuntractor.ADDSUBDemo;

public class Adder implements Runnable{
    private Count count;
    public Adder(Count count)
    {
        this.count=count;
    }

    public void run()
    {

            for (int i = 1; i <= 100000; i++) {


                count.val += i;

                //System.out.println("Hello");
            }


    }



}
