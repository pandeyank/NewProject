package TreeExcercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class lOrderLevelBy {
    static class Node1 {
        int val;
        Node1 left;
        Node1 right;

        Node1(int x) {
            this.val = x;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);

        traversal(root);

    }

    private static void traversal(Node1 root) {
        if (root == null)
            return;

        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node1 node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            System.out.println(); // Print newline to separate levels
        }
    }

}