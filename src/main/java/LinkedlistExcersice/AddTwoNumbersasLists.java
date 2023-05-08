package LinkedlistExcersice;

import java.util.List;

public class AddTwoNumbersasLists {
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
        a.next=b;
        b.next=c;
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(4);
        d.next=e;
        e.next=f;
        Node h1=a;
        Node h2=d;
        Node t1=reverselist(h1);
        Node t2=reverselist(h2);
        Node peek=new Node(-1);
        Node temp=peek;
        int carry=0;
        while (t1!=null || t2!=null)
        {
            int sum=t1.data+t2.data;
            System.out.println(sum);
            sum=(sum+carry)%10;
            System.out.println("------------");
            System.out.println(sum);

            carry=sum/10;
            temp.next=t1;
            temp=new Node(sum);
            t1=t1.next;
            t2=t2.next;

        }
        while (peek!=null)
        {
            System.out.print(peek.data +" ");
            peek=peek.next;
        }







    }

    private static Node reverselist(Node h1) {
        Node rh=null;
        Node head=h1;
        while (head!=null)
        {
            Node p=head;
            head=head.next;
            p.next=rh;
            rh=p;
        }
        return rh;
    }
}
