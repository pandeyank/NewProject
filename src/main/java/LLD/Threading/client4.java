package LLD.Threading;

public class client4 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++)
        {
            NumberPrinter2 np=new NumberPrinter2(i);
            Thread t=new Thread(np);
            t.start();
        }

    }
}
