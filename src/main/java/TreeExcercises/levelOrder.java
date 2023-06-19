package TreeExcercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class levelOrder {
    static class Node
    {
        int val;
        Node left;
        Node right;
        Node(int x)
        {
            this.val=x;
            left=null;
            right=null;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(11);
        Node b=new Node(6);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(7);
        Node f1=new Node(21);
        Node f2=new Node(13);
        Node f3=new Node(18);
        Node f4=new Node(16);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=f1;
        e.left=f2;
        f1.left=f3;
        f3.left=f4;
        Node root=a;
        levelTraversal(root);
    }

    private static void levelTraversal(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while (q.size()>0)
        {
            Node h=q.peek();
            q.poll();
            if(h.left!=null)
            {
                q.add(h.left);
            }
           if(h.right!=null)
           {
               q.add(h.right);
           }
           al.add(h.val);

        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
