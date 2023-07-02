package LLD.Iterator;

import java.util.Iterator;

public class NodeIterator implements Iterator {

    private Node currNode;

    //parameterized constructor - its overriding default constructor

    public NodeIterator(Node currNode) {
        this.currNode = currNode;
    }

    @Override
    public boolean hasNext() {
        return currNode != null;
    }

    @Override
    public Integer next() {
        int data = currNode.data;
        currNode = currNode.getNext();
        return data;
    }
}
