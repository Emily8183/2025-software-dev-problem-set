/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 * 1) Find the middle index; fast ptr and slow ptr
 * 2) reverse
 * 3) compare
 * 
 * two ptrs
 * 
 * SC: O(1), TC: O(n)
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
    public boolean isPalindrome(ListNode head) {

        if (head == null) return true; //当链表为空时，返回值要和面试官确认，也可能希望返回false

        //Step1: look for the mid node
        ListNode mid = getMid(head);

        //Step2: 翻转
        ListNode midNext = reverse(mid.next); 

        //step3: compare
        while (midNext != null) { //把后半截遍历到终点
            if (head.val == midNext.val) {
                head = head.next;
                midNext = midNext.next;
            } else {
                return false;
            }
        }

        return true;
    }

    private ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; 
        //奇数时,{1,2,3,2,1},slow是到3,正好是中间点; 
        //偶数时{3,4,4,3}, slow到the first 4, 前半截的最后一个node
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;

            cur.next = prev;

            prev = cur;

            cur = temp;
        }
        
        return prev;
    }
}
// @lc code=end

