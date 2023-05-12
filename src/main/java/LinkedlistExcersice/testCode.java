package LinkedlistExcersice;

public class testCode {
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
        Node b=new Node(1);
        Node c=new Node(6);
        Node d=new Node(4);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node head=a;
        Node mid=findMid(head);
        Node right=mid.next;
        mid.next=null;
        Node left=head;
        right=neReverse(right);
        if(palindrome(left,right)==true)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    private static boolean palindrome(Node left, Node right) {
        while (left!=null && right!=null)
        {
            if(left.data!= right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }

    private static Node neReverse(Node right) {
        Node temp=right;
        Node rh=null;
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
