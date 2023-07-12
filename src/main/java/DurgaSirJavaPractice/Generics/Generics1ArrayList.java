package DurgaSirJavaPractice.Generics;

import java.util.ArrayList;

public class Generics1ArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        String[] arr = new String[6];
        arr[0] = "Aman"; //---------->String array Type casting not required
        arr[1] = "Dhoni";
        al.add("Syam");
        al.add("Pawan");
        //al.add(new Integer(10));
        String str1 = (String) al.get(0);//---------->ArrayList TypeCasting required
        System.out.println(str1);
        String st2 = (String) al.get(1);
        System.out.println(st2);
        System.out.println();
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        /*String str3=(String) al.get(2);
        System.out.println(str3);
        System.out.println(arr[0]);*/
        //Type Saftey not present in Collections framework so introduce Generics.

        //Type Casting is bigger heache in Collection framework. To overcome these problems introduce Generics
        //Generics provides-->1 type safety 2.Resolve Type Casting problems


        System.out.println();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dhoni");
        arrayList.add("Yuvraj");
        arrayList.add("pawan");
        String s = arrayList.get(0);
        System.out.println(s);

    }

    }
