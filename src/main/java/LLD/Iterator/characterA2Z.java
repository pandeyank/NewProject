package LLD.Iterator;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class characterA2Z {
    public static void main(String[] args) {
        Queue<Character> q = new ArrayDeque<>();
        for (char c = 'a'; c <= 'z'; c++) {
            q.add(c);
        }
        System.out.print("[");
        Iterator<Character> itr= q.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() +" ");
        }
        System.out.println("]");

    }
}
