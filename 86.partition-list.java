/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
 * traverse, create two lists then combine
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode d1 = dummy1;
        ListNode d2 = dummy2;

        //指向数值
        while (head != null) {
            if (head.val < x) {
                d1.next = head;
                d1 = d1.next;
            } else {
                d2.next = head;
                d2 = d2.next;
            }

            head = head.next;
        }

        
        d2.next = null;  //断开 >= x 部分的尾部，防止循环链表
        
        // d1.next = d2.next; <= 错误的指向
        d1.next = dummy2.next;

        return dummy1.next;
        
    }
}
// @lc code=end

