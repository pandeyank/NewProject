package LinkedlistExcersice;

public class add2numbers {
    static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data =x;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(9);
        //Node c=new Node(3);
        a.next=b;
        //b.next=c;
        Node d=new Node(1);
        //Node e=new Node(6);
        //Node f=new Node(4);
        //d.next=e;
        //e.next=f;


        Node h1=a;
        Node h2=d;
        Node head=new Node(-1);
        Node temp=head;
        int carry=0;
        while (h1!=null || h2!=null)
        {
            int sum=0;
            if(h1!=null)
            {
                sum+=h1.data;
                h1=h1.next;
            }
            if(h2!=null)
            {
                sum+=h2.data;
                h2=h2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            Node curr=new Node(sum%10);
            temp.next=curr;
            temp=curr;
        }
        if(carry==1)
        {
            Node curr=new Node(1);
            temp.next=curr;
            temp=curr;
        }


        head=head.next;
        while (head!=null)
        {
            System.out.print(head.data +" ");
            head=head.next;
        }


    }
}
