/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 * 1) check if there's cycle => check if fast pointer and slow pointer can meet
 * 2) two pointers
 * 3) the order in the while condition
 * 4) edge case
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //edge case
        if (head == null) return false;

        ListNode fast = head;

        ListNode slow = head;

        //while (fast.next.next != null && fast.next != null) { //this order will throw NullPointerException
        while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow) return true;
        }

        return false;
        
    }
}

// @lc code=end

