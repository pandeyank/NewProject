package LLD.Iterator;

public class TestNodeIterator {
    public static void main(String[] args) {

        Node node1 = new Node(3);

        NodeIterator nodeIterator = new NodeIterator(node1);

        while(nodeIterator.hasNext()){
            System.out.println(nodeIterator.next());
        }

    }
}
