package LinkedlistExcersice;

public class ReorderList {
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
        //Node a8=new Node(8);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        //a7.next=a8;
        Node head=a1;
        Node mid=findMid(head);
        Node right=mid.next;
        mid.next=null;
        Node left=head;
        right=reverseList(right);
        Node t3=merge(left,right);
        while (t3!=null)
        {
            System.out.print(t3.data +" ");
            t3=t3.next;
        }

    }

    private static Node merge(Node left, Node right) {
        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;
        }
        Node res=new Node(-1);
        Node temp=res;
        while (left!=null && right!=null)
        {
            temp.next=left;
            temp=left;
            left=left.next;

            temp.next=right;
            temp=right;
            right=right.next;

        }
        if(left==null)
        {
            temp.next=right;
        }
        if(right==null)
        {
            temp.next=left;
        }
        res=res.next;
        return res;
    }

    private static Node reverseList(Node right) {
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
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }
}
