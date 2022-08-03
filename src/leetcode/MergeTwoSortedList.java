package leetcode;

import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next = new ListNode(4);

        ListNode ans = mergeTwoLists(list1,list2);



    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode starterNode = new ListNode(0);
        ListNode temp = starterNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode newNode = new ListNode(list1.val);
                starterNode.next = newNode;
                starterNode = starterNode.next;
                list1 = list1.next;
            } else {
                ListNode newNode = new ListNode(list2.val);
                starterNode.next = newNode;
                starterNode = starterNode.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            starterNode.next = newNode;
            starterNode = starterNode.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            starterNode.next = newNode;
            starterNode = starterNode.next;
            list2 = list2.next;
        }

        return temp.next;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
