import java.util.*;

public class LevelOrderTraversal {

    //'main' method must be in a class 'Rextester'.
//openjdk version '11.0.5'
    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printLevelOrderTeaversal(root);

    }

    static void printLevelOrderTeaversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempRoot = queue.poll();
            System.out.println(tempRoot.data + " ");
            if (tempRoot.left != null) {
                queue.add(tempRoot.left);
            }
            if (tempRoot.right!= null) {
                queue.add(tempRoot.right);
            }
        }
    }

// end of method

}

class Node {
    Node node;
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }


}
