package LLD.Iterator;

import java.util.*;


public class MaxMiniterator {
    public static void main(String[] args) {
    Collection<Integer> queue=new ArrayDeque<>();
    queue.add(10);
    queue.add(5);
    queue.add(17);
    queue.add(39);
    queue.add(13);
    queue.add(1);
    int max=0;
    int min=Integer.MAX_VALUE;
    Iterator<Integer> itr=queue.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
        max=Collections.max(queue);
        min=Collections.min(queue);
    }
        System.out.println("Max is :" +max);
        System.out.println("Min is :" +min);



}
}
