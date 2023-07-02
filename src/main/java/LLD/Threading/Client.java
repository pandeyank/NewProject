package LLD.Threading;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World Printer: " +Thread.currentThread().getName());
        HelloWorldPrinter task=new HelloWorldPrinter();
        Thread th=new Thread(task);
        th.start();


    }
}
