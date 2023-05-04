package LinkedlistExcersice;

public class ReverseKtimes{
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
        Node f=new Node(6);
        Node g=new Node(7);
        Node h1=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h1;
        int k=4;
        Node h=a;
        Node y=listReverse(h,k);
        while (y!=null)
        {
            System.out.print(y.data +" ");
            y=y.next;
        }







    }

    private static Node listReverse(Node h,int k) {
        Node th=h;
        Node temp=h;
        Node rh=null;
        int c=0;
        while((c<k)&&(h!=null))
        {
            temp=h;
            h=h.next;
            temp.next=rh;
            rh=temp;
            c++;
        }
        if(h!=null)
        {
            th.next=listReverse(h,k);
        }
        return rh;

    }
}
