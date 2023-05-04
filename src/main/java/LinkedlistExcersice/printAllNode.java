package LinkedlistExcersice;

public class printAllNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }

        public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            int count = 0;
            Node head = a;
            a.next = b;
            b.next = c;
            c.next = d;
            //  System.out.println(a);-->print address of Node a
            // System.out.println(b);
            while (head != null) {
                count++;
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
            System.out.println("The total node in the list is:" + count);

        }
    }
}