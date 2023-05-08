package LinkedlistExcersice;

public class rearrangeList {
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
        //Node i=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        //g.next=i;
        Node head=a;
        Node t3=reaarange(head);
        printList(t3);

    }

    private static void printList(Node head) {
        while (head!=null)
        {
            System.out.print(head.data +" ");
            head=head.next;
        }

    }

    private static Node reaarange(Node head) {
        Node mid=findMid(head);
        Node right=mid.next;
        mid.next=null;
        Node left=head;
        right=reverse(right);
        Node t3=merge(left,right);
        return t3;
    }

    private static Node merge(Node left, Node right) {
        Node res=new Node(-1);
        Node temp=res;
        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;

        }
        while (left!=null && right!=null)
        {
            res.next=left;
            res=left;
            left=left.next;
            res.next=right;
            res=right;
            right=right.next;
        }
        if(left==null)
        {
            res.next=right;
        }
        if(right==null)
        {
            res.next=left;
        }
        temp=temp.next;
        return temp;
    }

    private static Node reverse(Node right) {
        Node rh=null;
        Node temp=right;
        while (temp!=null)
        {
            Node p=temp;
            temp=temp.next;
            p.next=rh;
            rh=p;
        }
        return rh;
    }

    private static Node findMid(Node head) {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
