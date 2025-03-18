/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //edge cases
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        //dummyHead, and create a cur pointing to the dummyHead
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        //while-loop: to check which node to link with
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        //leftover
        if (list1 != null) {
            cur.next = list1;
        } else if (list2 != null) {
            cur.next = list2;
        }

        return dummyHead.next;
    }
}
// @lc code=end

