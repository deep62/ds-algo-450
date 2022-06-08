/*
package algoexpert;


*/
/*class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }*//*



class Solution {

   */
/* public static void main(String args[]){
        TreeNode node = new TreeNode();
        node.val = 5;
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);

        node.right = new TreeNode(6);
        node.right.right = new TreeNode(7);

        node = deleteTreeNode(node,7);
        inorder(node);
    }

    public static TreeNode deleteTreeNode(TreeNode root, int key) {

        if(root == null){
            return root;
        }
        else if(key < root.val){
            deleteTreeNode(root.left,key);
        }
        else if(key > root.val){
            deleteTreeNode(root.right,key);
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

    static int findMinTreeNode(TreeNode root){
        int minVal =0;
        TreeNode currentTreeNode = root.right;
        while(currentTreeNode!=null && currentTreeNode.left != null){
            minVal = currentTreeNode.val;
            findMinTreeNode(currentTreeNode.left);
        }
        return currentTreeNode.val;
    }

    public static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);

        }
    }*//*


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

}*/
