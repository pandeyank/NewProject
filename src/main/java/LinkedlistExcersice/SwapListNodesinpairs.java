package LinkedlistExcersice;

public class SwapListNodesinpairs {
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
        Node head=a;
        int k=2;
        Node t=swapPairs(head,k);
        while (t!=null)
        {
            System.out.print(t.data +" ");
            t=t.next;
        }




    }

    private static Node swapPairs(Node head, int k) {
        Node th=head;
        Node rh=null;
        Node temp=head;
        if(head==null)
        {
            return head;
        }
        while (k>0 && temp!=null)
        {
            Node p=temp;
            temp=temp.next;
            p.next=rh;

            rh=p;
            k--;
        }
        if(temp!=null)
        {
            th.next=temp;
        }
        Node t=swapPairs(temp,2);
        th.next=t;
        return rh;
    }
}
