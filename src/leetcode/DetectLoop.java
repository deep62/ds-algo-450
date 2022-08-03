package leetcode;


import java.util.List;

public class DetectLoop {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode temp = listNode.next = new ListNode(2);
        listNode.next = new ListNode(0);
        listNode.next = new ListNode(-4);
        listNode.next = temp;
        ListNode node =detectCycle(listNode);
        if (node == null) {
            System.out.println(node);
        } else {
            System.out.println("null");
        }

    }
        static public ListNode detectCycle(ListNode head) {
            ListNode tortoise = head;
            ListNode hare = head;
            ListNode intersectionNode = null;
            while(tortoise!=null && hare!=null && tortoise.next!=null){
                tortoise = tortoise.next;
                hare = hare.next.next;
                if(tortoise==hare){
                    intersectionNode = tortoise;
                    break;
                }
                // find the node of intersection
            }
            if(intersectionNode == null){
                return null;
            }
            while(head!=intersectionNode){
                head = head.next;
                intersectionNode = intersectionNode.next;

            }
            return head;

        }
    }
