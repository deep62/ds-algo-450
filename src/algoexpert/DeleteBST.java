package algoexpert;


class Node {
      int val;
      Node left;
      Node right;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node left, Node right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class DeleteBST {

 public static void main(String args[]){
        Node node = new Node();
        node.val = 5;
        node.left = new Node(3);
        node.left.left = new Node(2);
        node.left.right = new Node(4);

        node.right = new Node(6);
        node.right.right = new Node(7);

        node = deleteTreeNode(node,7);
        inorder(node);
    }

    public static Node deleteTreeNode(Node root, int key) {

        Node parent = root;
        if(root == null){
            return root;
        }
        else if(key < root.val){
            root.left = deleteTreeNode(root.left,key);
        }
        else if(key > root.val){
            root.right = deleteTreeNode(root.right,key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.val = findMinTreeNode(root);
            root.right=deleteTreeNode(root.right, root.val);
        }
        return root;
    }

    static int findMinTreeNode(Node root){
        int minVal =0;
        Node currentNode = root.right;
        while(currentNode !=null && currentNode.left != null){
            minVal = currentNode.val;
            findMinTreeNode(currentNode.left);
        }
        return currentNode.val;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);

        }
    }


    static class Program {

        public static void main(String args[]){
        TreeNode node = new TreeNode(5);
        node.value = 5;
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);

        node.right = new TreeNode(6);
        node.right.right = new TreeNode(7);

       boolean isPresent = TreeNode.contains(node,6);
    }

        static class TreeNode {
            public int value;
            public TreeNode left;
            public TreeNode right;

            public TreeNode(int value) {
                this.value = value;
            }

            public TreeNode insert(int value) {
                TreeNode root = this;
                TreeNode newBST = new TreeNode(value);
                if(root == null){
                    return newBST;
                }
                if(value < root.value){
                    left = left.insert(value);
                }
                else if(value > root.value){
                    right = right.insert(value);
                }
                return root;
            }

           static public boolean contains(TreeNode root,int value) {

                if(root == null){
                    return false;
                }
                if(value == root.value){
                    return true;
                }
                if(value > root.value){
                    return root.right.contains(root,value);
                }
                else if(value < root.value){
                    return root.left.contains(root,value);
                }
                return false;
            }

            public TreeNode remove(int value) {
                // Write your code here.
                // Do not edit the return statement of this method.
                return this;
            }
        }
    }

}
