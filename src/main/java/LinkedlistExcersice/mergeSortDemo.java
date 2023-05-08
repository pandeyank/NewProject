package LinkedlistExcersice;

public class mergeSortDemo {
    static class Node1
    {
        int data ;
        Node next;
        Node1(int x)
        {
            this.data=x;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(-2);
        Node c = new Node(6);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(9);
        Node h = new Node(4);
        Node i = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        Node head=a;
        Node t3=mergeSort(head);
        printList(t3);




    }

    private static Node printList(Node head) {
        Node temp = head;
        while (head !=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }

        return temp;
    }

    private static Node mergeSort(Node head) {
        if((head==null)||(head.next==null))
        {return head;}
        // temp = head;
        Node m = mid(head);
        //Node midSameHead = printTillMid(head, m);
        Node right=m.next;
        m.next=null;
        Node left=head;
        left=mergeSort(left);
        right=mergeSort(right);
        Node t3=merge(left,right);
        return t3;


    }


    private static Node merge(Node t1, Node t2) {{
        Node p = new Node(-1);
        Node th = p;
        if (t1.data < t2.data) {
            p.next=t1;
            p=t1;
            t1=t1.next;


        } else {
            p.next = t2;
            p=t2;
            t2 = t2.next;
        }


        while ((t1 != null) && (t2 != null)) {
            if (t1.data < t2.data) {
                p.next = t1;
                p=t1;
                t1 = t1.next;
            } else {
                p.next = t2;
                p=t2;
                t2 = t2.next;
            }

        }

        if (t1 == null) {
            p.next = t2;
        }
        if (t2 == null) {
            p.next = t1;
        }
        th=th.next;
        return th;
    }

    }

    private static Node mid(Node head) {
        Node slow=head;
        Node fast=head.next;
        while ((fast!=null)&&(fast.next!=null))
        {
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }

}
