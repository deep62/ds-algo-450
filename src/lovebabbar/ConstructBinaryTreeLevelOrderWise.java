package lovebabbar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConstructBinaryTreeLevelOrderWise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6};
        Node root = insertLevelOrder(arr,0);
       // inorder(root);
        printLevelOrder(root);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }
    public static Node insertLevelOrder(int[] arr, int i){
       Node root = null;
       if(i < arr.length){
           root = new Node(arr[i]);
           root.left = insertLevelOrder(arr,2*i+1);
           root.right = insertLevelOrder(arr,2*i+2);
       }
       return root;
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}