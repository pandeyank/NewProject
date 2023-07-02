package LLD.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        Iterator<Integer> it=al.iterator();
        while (it.hasNext())
        {
            Integer num=it.next();
           if(num<=20)
            {
                it.remove();
            }
            System.out.println(it.next());
        }
        //System.out.println(al);


    }
}
