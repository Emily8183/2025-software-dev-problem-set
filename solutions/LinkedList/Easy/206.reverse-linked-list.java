/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 * reverse: change the pointer's direction
 * return prev
 * 
 * Iterative(Two ptrs)：
 * 
 * head = [1,   2,   3,4,5]
 *   pre  cur   temp
 *   cur  temp  pre
 * 
 * TC: O(N), SC: O(1)
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
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;
        ListNode temp;

        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;

    }
}
// @lc code=end

