package LinkedlistExcersice;

public class Flattenalinkedlist {
    static class Node
    {
        int data;
        Node right;
        Node down;
        Node(int x)
        {
            this.data=x;
            right=null;
            down=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(7);
        Node c=new Node(7);
        Node d=new Node(4);
        Node e=new Node(11);
        a.down=b;
        b.down=c;
        a.right=d;
        d.down=e;
        Node head=a;
        Node p=flatten(head.right);
        Node t=merge(head,p);
        while (t!=null)
        {
            System.out.print(t.data +" ");
            t=t.right;
        }




    }

    private static Node merge(Node head, Node temp) {
        if(head==null)
        {
            return temp;
        }
        if(temp==null)
        {
            return head;
        }

        Node merged=null;
        if(head.data<=temp.data)
        {
            merged=head;
            merged.down=merge(head.down,temp);

        }
        else {
            merged=temp;
            merged.down=merge(head,temp.down);
        }

        return merged;
    }

    private static Node flatten(Node head) {
        if(head==null || head.right==null)
        {
            return head;
        }
        return null;



    }
}
