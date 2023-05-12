package LinkedlistExcersice;

import java.util.HashSet;

public class intersectionPointExtraSpace {
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
        Node a1=new Node(1);
        Node a2=new Node(2);
        Node a3=new Node(3);
        Node a4=new Node(4);
        Node a5=new Node(5);
        Node a6=new Node(6);
        Node a7=new Node(7);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        Node b1=new Node(11);
        Node b2=new Node(12);
        Node b3=new Node(13);
        b1.next=b2;
        b2.next=b3;
        b3.next=a4;
        Node h1=a1;
        Node h2=b1;
        intersectionPoint(h1,h2);
        //intersectionPoint(h2);



    }

    private static void intersectionPoint(Node h1,Node h2) {
        HashSet<Node> hs=new HashSet<>();
        Node res=new Node(-1);
        Node temp=h1;
        Node temp1=h2;
        while (temp!=null)
        {
            if(!hs.contains(temp))
            {
                hs.add(temp);
                temp=temp.next;
            }
            
        }
        while (temp1!=null)
        {
            if(hs.contains(temp1))
            {
                for(Node t:hs)
                {
                    if(t.equals(temp1))
                    {
                        res.next=temp1;
                    }
                }
                break;

            }
            temp1=temp1.next;
        }
        res=res.next;
        System.out.print(res.data +" ");
    }
}
