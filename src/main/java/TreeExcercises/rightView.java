package TreeExcercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class rightView {
    static class Node
    {
        int val;
        Node left;
        Node right;
        Node(int x)
        {
            this.val=x;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        Node a1=new Node(3);
        Node a2=new Node(9);
        Node a3=new Node(8);
        Node a4=new Node(6);
        Node a5=new Node(2);
        Node a6=new Node(-7);
        Node a7=new Node(-4);
        Node a8=new Node(8);
        Node a9=new Node(10);
        a1.left=a2;
        a1.right=a3;
        a2.right=a4;
        a3.left=a5;
        a3.right=a6;
        a5.left=a7;
        a5.right=a8;
        a8.left=a9;
        Node root=a1;
        rightView2(root);
    }

    private static void rightView2(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        al.add(q.peek().val);
        while (q.size()>1)
        {
            Node p=q.poll();

            if(p==null)
            {
                al.add(q.peek().val);
                q.add(null);
            }
            else {

                if (p.right != null) {
                    q.add(p.right);
                }
                if (p.left != null) {
                    q.add(p.left);
                }
            }

        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
