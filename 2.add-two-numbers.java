/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            //step 1: retrieve the number from each list
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            //step 2: add on including the carry
            int sum = num1 + num2 + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            cur = cur.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        //step 3: check if there's any carry left
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return dummyHead.next;

    }

}
// @lc code=end

