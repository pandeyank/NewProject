package LinkedlistExcersice;

public class intesectionPointImproovede {
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
        Node res=new Node(-1);
        Node h1=a1;
        Node h2=b1;
        //Node temp1=h1;
        //Node temp2=h2;
        Node head=intsection(h1,h2);
        nodeCycle(head);




    }

    private static void nodeCycle(Node h1) {
        Node slow=h1;
        Node fast=h1;
        Node s2=null;
        Node p=new Node(-1);
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
             s2=slow;
             break;

            }


        }
        Node s1=h1;
        while (s1!=s2)
        {
            s1=s1.next;
            s2=s2.next;
        }
        p.next=s1;
        p=p.next;
        System.out.println(p.data);

    }

    private static Node intsection(Node h1, Node h2) {
        Node temp1=h1;
        while (temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=h2;
        return h1;

    }
}
