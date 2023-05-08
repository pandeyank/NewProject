package LinkedlistExcersice;

public class newCycle {
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
        Node a8=new Node(8);
        Node a9=new Node(9);
        Node a10=new Node(10);
        Node a11=new Node(11);
        Node a12=new Node(12);

        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;
        a8.next=a9;
        a9.next=a10;
        a10.next=a11;
        a11.next=a12;
        a12.next=a6;
        Node head=a1;
        while (head!=null)
        {
            System.out.print(head.data +" ");
            head=head.next;
        }
       
    }
}
