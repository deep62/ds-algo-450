package lovebabbar;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    public static Node deleteNode(Node root, int X) {
        if(root == null){
            return null;
        }
        if(X > root.data){
            root.right =  deleteNode(root.right,X);
        }else if(X < root.data){
            root.left =  deleteNode(root.left,X);
        }else{
            if(root.left==null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.data = getMinValue(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }
    static int getMinValue(Node root){
        int min = root.data;
        while(root!=null){
            if(root.data < min){
                min = root.data;
            }
            root = root.left;
        }
        return min;
    }

    public static lovebabbar.Node insertLevelOrder(int[] arr, int i){
        lovebabbar.Node root = null;
        if(i < arr.length){
            root = new lovebabbar.Node(arr[i]);
            root.left = insertLevelOrder(arr,2*i+1);
            root.right = insertLevelOrder(arr,2*i+2);
        }
        return root;
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
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, -1, 40, 60, 80,};
        Node root = insertLevelOrder(arr,0);
        printLevelOrder(root);
        deleteNode(root,50);
        printLevelOrder(root);

    }
}
