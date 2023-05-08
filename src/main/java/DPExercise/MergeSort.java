package DPExercise;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSort {

    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        Node head = constructLinkedList();
        //printList(head);
        Node nhead = ms.mergeSortMethod(head);
        printList(nhead);


    }

    public Node mergeSortMethod(Node head) {

      if(head== null || head.next == null)  return head;

        Node mid = findMid(head);
        Node left=head;
        Node right = mid.next;
        mid.next = null;
        left = mergeSortMethod(left);
        right = mergeSortMethod(right);
        Node t3=merge(left,right);
        return t3;




    }

    private static Node merge(Node left, Node right) {
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                temp=left;
                left=left.next;
            } else {
                temp.next = right;
                temp = right;
                right=right.next;
            }

        }

        if (left != null) {
            temp.next = right;
        } else {
            temp.next = left;
        }
        System.out.println("I am here in the method" );
        dummyHead=dummyHead.next;
        return dummyHead;

    }


    private static Node findMid(Node head) {

        Node slow = head, fast = head.next;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static void printList(Node head) {
        //Node temp = head;
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node constructLinkedList() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in list");
        int n = scan.nextInt();
        int i =0;
        
        Node head = new Node(-1);
        Node temp = head;
        
        while(i<n){
            int d = scan.nextInt();
            temp.next = new Node(d);
            temp = temp.next;
            i++;
        }
        
        head = head.next;
        temp.next = null;
        return head;
        
    }
}
