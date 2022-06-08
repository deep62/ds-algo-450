package algoexpert;

import java.util.*;

class FindClosest {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int closest = Integer.MAX_VALUE;;
        if(Math.abs(target-closest) > Math.abs(target-tree.value)){
            closest = tree.value;
        }
        if(target > tree.value && tree.right!=null){
            return findClosestValueInBst(tree.right,target);
        }else if(target < tree.value && tree.left!=null){
            return findClosestValueInBst(tree.left,target);
        }else{
            return closest;
        }

    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
