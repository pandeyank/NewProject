package LinkedlistExcersice;

import java.util.HashSet;

public class PartitionList {
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
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        int B=3;
        Node head=a;
        partion(head,B);
        System.out.println();
        System.out.println("Hello");
    }

    private static void partion(Node head, int b) {
        Node res=new Node(-1);
        Node ans=res;
        Node temp1=head;
        Node temp2=head;
        Node h1=head;
        Node temp3=head;
        Node temp4=head;
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        Node p=new Node(-1);
        Node x=p;
        while (temp1!=null)
        {
            if(temp1.data<b && count<=b)
            {
                hs.add(temp1.data);
                res.next=temp1;
                temp1=temp1.next;
                res=res.next;
                count++;
            }
            else {
                if(!hs.contains(x.data))
                {
                    p.next=temp1;
                    temp1=temp1.next;
                    p=p.next;
                }

            }
        }
        p.next=null;
        while (temp2!=null)
        {
            System.out.print(temp2.data +" ");
            temp2=temp2.next;
        }
        x=x.next;
        System.out.println();
        while (temp3.next!=null)
        {
            temp3=temp3.next;
        }
        temp3.next=x;

        while (temp4!=null)
        {
            System.out.print(temp4.data +" ");
            temp4=temp4.next;
        }



    }
}
