package LLD.Generics;

public class RoofTest {
    public static void main(String[] args) {
        Roof r=new Roof(8);
        Roof r2=new Roof(8);
        if(r.equals(r2))
        {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }
    }
}
