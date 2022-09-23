package lovebabbar;

public class KthAncesorBinaryTree {
    static int k = 2;
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Node root = ConstructBinaryTreeLevelOrderWise.insertLevelOrder(arr,0);
        //ConstructBinaryTreeLevelOrderWise.printLevelOrder(root);
        int ans = kthAncestor(root,4);
        System.out.print("ans "+ans);
    }
    public static int kthAncestor(Node root, int node)
    {

        Node ans = solve(root, node);
        if(ans == null || root.data == node){
            return -1;
        }
        return ans.data;
    }
    public static Node solve(Node root, int node){
        if(root == null ){
            return null;
        }
        if(root.data == node){
            return root;
        }
        Node leftAns = solve(root.left, node);
        Node rightAns = solve(root.right,node);
        if(leftAns!=null && rightAns==null){
            k--;
            if(k<=0){
                k = Integer.MAX_VALUE;
                return root;
            }
            return leftAns;
        }
        if(rightAns!=null && leftAns == null){
            k--;
            if(k<=0){
                k = Integer.MAX_VALUE;
                return root;
            }
            return rightAns;
        }
        return null;
    }
}
