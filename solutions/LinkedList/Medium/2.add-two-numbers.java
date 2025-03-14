/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 * 1）用0代替空位
 * 2）carry
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

        //step 1: get the number from the lists, 用0代替空位
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int num1 = l1 == null? 0 : l1.val;
            int num2  = l2 == null? 0 : l2.val; 

            //step 2: add, carry
            //notice here should be cur.next, and need to create a new ListNode
            int sum = num1 + num2 + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            cur = cur.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        //step 3: 最后检查carry值，有的话加上
        // or if (carry != 0)
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return dummyHead.next; 
    }
}
// @lc code=end

