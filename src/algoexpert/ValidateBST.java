package algoexpert;

class TreeNode1 {
     int val;
      TreeNode right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode left;
      TreeNode1(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class ValidateBST {

        public boolean isValidBST(TreeNode root) {
            if(root == null){
                return true;
            }
            if(root.right!=null && root.right.val <= root.val && root.left!=null &&     root.left.val >= root.val){
                System.out.println("root.val "+root.val);
                System.out.println("root.left "+root.left.val);
                System.out.println("root.right "+root.right.val);
                return false;
            }
            return isValidBST(root.left) && isValidBST(root.right);

        }

    public static void main(String[] args) {


    }
}
