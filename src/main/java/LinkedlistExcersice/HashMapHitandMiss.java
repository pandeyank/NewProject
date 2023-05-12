package LinkedlistExcersice;

import java.util.HashMap;
import java.util.Map;

public class HashMapHitandMiss {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,10);
        hm.put(2,15);
        hm.put(3,19);
        int key=2;
        for (Map.Entry<Integer, Integer> entry:hm.entrySet())
        {
            if(entry.getKey()==key)
            {
                System.out.print(entry.getValue() +" ");
            }

        }
    }
}
