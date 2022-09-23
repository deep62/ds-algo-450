package lovebabbar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class BurnTree
    {
        /*class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                left = null;
                right = null;
            }
        }*/
        static HashMap<Node,Node> nodeToParent = new HashMap<Node,Node>();
        public static int minTime(Node root, int target)
        {
            Node targetNode = getParentMapping(root,target);
            int ans = burnTree(root,targetNode);
            return ans;

        }
        static int burnTree(Node root, Node target){
            int time = 0;

            HashMap<Node,Boolean> visited = new HashMap<>();
            Queue<Node> q = new LinkedList<Node>();
            q.add(target);
            visited.put(target,true);
            while(!q.isEmpty()){
                boolean flag = false;
                int size = q.size();
                for(int i=0; i< size ;i++){
                    Node front = q.poll();
                    if(front.left!=null && !visited.containsKey(front.left)){
                        visited.put(front.left,true);
                        q.add(front.left);
                        flag = true;
                    }
                    if(front.right!=null && !visited.containsKey(front.right)){
                        visited.put(front.right,true);
                        q.add(front.right);
                        flag = true;
                    }
                    Node parent = nodeToParent.get(front);
                    if(parent !=null && !visited.containsKey(parent)){
                        visited.put(parent,true);
                        q.add(parent);
                        flag = true;
                    }
                }
                if(flag){
                    time++;
                }
            }
            return time;
        }
        static Node getParentMapping(Node root,int target){
            Node targetNode = null;
            nodeToParent.put(root,null);
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            while(!q.isEmpty()){
                Node front = q.poll();
                if(front.data == target){
                    targetNode = front;
                }
                if(front.left!=null){
                    nodeToParent.put(front.left,front);
                    q.add(front.left);
                }
                if(front.right!=null){
                    nodeToParent.put(front.right,front);
                    q.add(front.right);
                }
            }
            return targetNode;
        }
    }
