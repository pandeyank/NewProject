package LinkedlistExcersice;

public class MergeList {
    //Merge 2 sorted List
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
        Node a=new Node(2);
        Node b=new Node(5);
        Node c=new Node(9);
        Node d=new Node(14);
        Node e=new Node(19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //Node h1=null;
        Node p=new Node(3);
        Node q=new Node(6);
        Node r=new Node(10);
        Node s=new Node(11);
        Node u=new Node(12);
        p.next=q;
        q.next=r;
        r.next=s;
        s.next=u;
        Node h1=a;
        Node h2=p;
        if(h1==null)
        {
            while (h2!=null)
            {
                System.out.print(h2.data +" ");
                h2=h2.next;
            }
            System.exit(0);

        }
        if(h2==null)
        {
            while (h1!=null)
            {
                System.out.print(h1.data +" ");
                h1=h1.next;
            }
            System.exit(0);
        }
        /*while(h1!=null)
        {
            System.out.print(h1.data +" ");
            h1=h1.next;
        }
        System.out.println();
        while (h2!=null)
        {
            System.out.print(h2.data +" ");
            h2=h2.next;*/
        Node head=null;
        if(h1.data<h2.data)
        {
            head=h1;
            h1=h1.next;
        }
        else {
            head=h2;
            h2=h2.next;
        }
        Node temp=head;
        while((h1!=null)&&(h2!=null))
        {
            if(h1.data<h2.data)
            {
                temp.next=h1;
                temp=h1;
                h1=h1.next;
            }
            else {
                temp.next=h2;
                temp=h2;
                h2=h2.next;
            }
        }
        if(h1==null)
        {
            temp.next=h2;
        }
        if(h2==null)
        {
            temp.next=h1;
        }
        while (head!=null)
        {
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
}
