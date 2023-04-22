package org.example;

class Test
{
    private static Test t=new Test();
    private Test()
    {

    }
    public static Test getTest()
    {
        return t;
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1=Test.getTest();
        Test t2=Test.getTest();
        System.out.println(t1);
        System.out.println(t2);

    }





}