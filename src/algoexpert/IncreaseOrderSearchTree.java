package algoexpert;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
}
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList = inOrder(root);
        root = constructTree(arrayList);
        return root;

    }

    static public ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(root == null){
            return null;
        }
        inOrder(root.left);
        arrayList.add(root.val);
        inOrder(root.right);
        return arrayList;
    }

    static public TreeNode constructTree(ArrayList<Integer> arrayList){
        TreeNode rootNode = new TreeNode();
        rootNode.val = arrayList.get(0);
        for(int i=1 ; i < arrayList.size(); i++ ){
            rootNode.val = arrayList.get(i);
            rootNode.left = null;
        }
        return rootNode;

    }


}