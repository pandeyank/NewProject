package TreeExcercises;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderNewUpdated {
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
        newOrder(root);


    }

    private static void newOrder(Node root) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            ArrayList<Integer> inner=new ArrayList<>();
           int size= queue.size();
           for(int i=0;i<size;i++)
           {
               Node p= queue.poll();

               if(p.left!=null)
               {
                   queue.add(p.left);

               }
               if(p.right!=null)
               {
                   queue.add(p.right);
               }
               inner.add(p.val);

           }
           outer.add(inner);


        }
        printResult(outer);

    }

    private static void printResult(ArrayList<ArrayList<Integer>> outer) {
        int nRow=outer.size();
        int[][] res=new int[nRow][];
        for(int i=0;i<nRow;i++)
        {
            ArrayList<Integer> al=outer.get(i);
            int ncol=al.size();
            res[i]=new int[ncol];
            for(int j=0;j<ncol;j++)
            {
                res[i][j]=al.get(j);
            }
        }

        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }
    }
}
