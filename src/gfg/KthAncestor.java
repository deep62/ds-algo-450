package gfg;

/* Java program to calculate Kth ancestor of given node */
import java.util.*;
class KthAncestor {
    // A Binary Tree Node
    static HashMap<Integer,Integer> ancestor_map = new HashMap<Integer,Integer>();
    static class Node
    {
        int data;
        Node left, right;
    }

    public static int kthAncestor(Node root, int k, int node)
    {
        generateAncestor(root);
        int count = 0;
        while(node!=1){
            node = ancestor_map.get(node);
            count++;
            if(count==k)
                break;
        }
        return node;
    }

    public static void generateAncestor(Node root){
        ancestor_map.put(root.data,-1);
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left!=null){
                ancestor_map.put(temp.left.data,temp.data);
                q.add(temp.left);
            }
            if(temp.right!=null){
                ancestor_map.put(temp.right.data,temp.data);
                q.add(temp.right);
            }
        }
    }

    // Utility function to create a new tree node
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        // Let us create binary tree shown in above diagram
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        int k = 3;
        int node = 5;

        // print kth ancestor of given node
        System.out.println(kthAncestor(root,k,node));
    }
}

