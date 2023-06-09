package LLD.Iterator;

import java.util.Iterator;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
    Node(Node next, int data){
        this.next = next;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
