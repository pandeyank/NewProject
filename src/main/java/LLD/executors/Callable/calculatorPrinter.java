package LLD.executors.Callable;

import java.util.concurrent.Callable;

public class calculatorPrinter implements Callable {
    private int a;
    private int b;
    calculatorPrinter(int x,int y)
    {
        this.a=x;
        this.b=y;
    }
    public Object call() throws Exception
    {
       int sum;
       System.out.println("Addition of the number is:" +Thread.currentThread().getName());
       sum=a+b;
       System.out.println(sum);
       Thread.sleep(5000);
       System.out.println("Subtraction of the number is:" +Thread.currentThread().getName());
       sum=a-b;
        System.out.println(sum);
       Thread.sleep(5000);
       System.out.println("Multiplicatio of the number is:" +Thread.currentThread().getName());
       sum=a*b;
        System.out.println(sum);
       Thread.sleep(5000);
       System.out.println("Division of the number is:" +Thread.currentThread().getName());
       sum=a/b;
       System.out.println(sum);

        System.out.println();
       return sum;



    }
}
