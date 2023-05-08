package LinkedlistExcersice;

import java.util.HashSet;

public class cycleDetectionExtraSpace {
    static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data=x;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        Node head=a;
        if(cycleDetect(head))
        {
            System.out.println("Cycle is present:");
        }
        else {
            System.out.println("Cycle is not present:");
        }
    }

    private static boolean cycleDetect(Node head) {
        Node temp=head;
        HashSet<Node> hs=new HashSet<>();
        while (temp!=null)
        {
            if(hs.contains(temp))
            {
                return true;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
