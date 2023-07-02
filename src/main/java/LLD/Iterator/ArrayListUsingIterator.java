package LLD.Iterator;

import LLD.PolymorphismExample.A;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("BMW");
        al.add("Maruti");
        al.add("Honda");
        al.add("Hero");
        al.add("Mercediz");
        al.add("Jaguar");
        Iterator<String> it=al.iterator();
        //System.out.println();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
