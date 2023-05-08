package LinkedlistExcersice;

public class MergeSortLL {

   

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
        Node head = a;

        System.out.println("Hi");
        Node sortedList = mergeSort(head);
        printList(sortedList);
    }

    private static Node mergeSort(Node head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        Node m = mid(head);
        Node left=head;
        Node right = m.next;
        m.next = null;
        left = mergeSort(left);
        right = mergeSort(right);
        System.out.println("Hello");
        Node t3 = merge(left, right);
        //return t3;
        //return head;
        return t3;
    }

    private static Node merge(Node t1, Node t2) {
        Node p = new Node(-1);
        Node th = p;
        if (t1.data < t2.data) {
            p.next=t1;
            p=t1;
            t1=t1.next;
        } else {
            p.next=t2;
            p=t2;
            t2=t2.next;

        }


        while ((t1 != null) && (t2 != null)) {
            if (t1.data < t2.data) {
                p.next = t1;
                t1 = t1.next;
            } else {
                p.next = t2;
                t2 = t2.next;
            }
            p = p.next;
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

    private static Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while ((fast != null) && (fast.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}