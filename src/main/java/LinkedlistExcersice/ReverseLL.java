package LinkedlistExcersice;

public class ReverseLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }
    public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node head = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

            int B = 2;
            int C = 4;
            int i = 1;

            Node temp = head;
            Node rh = null;
            while (i < B) {
                temp = temp.next;
                i++;
            }
            Node th = temp;
            Node p = th;
            System.out.println("Hello");
            for (int j = B; j <= C; j++) {
                temp = p;
                p = p.next;
                temp.next = rh;
                rh = temp;
            }
            if (temp != null) {
                th.next = temp;
            }


        }
    }

