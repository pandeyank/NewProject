package org.example;

import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Aman",101);
        hm.put("Shyam",202);
        hm.put("Pawan",301);
        hm.put("Nayan",209);
        hm.put("Tarun",11);
        hm.put("Akshay",890);
        Iterator<String> itr=hm.keySet().iterator();
        while (itr.hasNext())
        {
            String key=itr.next();
            System.out.println(key +" " +hm.get(key));

        }
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        int val=hm.get("Nayan");
        System.out.println(val);
        int val1=hm.get("Akshay");
        System.out.println(val1);




    }
}
