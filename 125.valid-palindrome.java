/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 * goal: palindrome -(Character.toLowerCase(), Character.isLetterOrDigit())
 * solution: two ptrs
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        // s = s.replaceAll("\\s", ""); //must re-assign to the string

        int start = 0;

        int end = s.length()-1;

        while (start < end) {
            
            char left = s.charAt(start);
            char right = s.charAt(end);

            if (!Character.isLetterOrDigit(left)) {
                start++;
                continue; // Skip and restart loop
            }

            if (!Character.isLetterOrDigit(right)) {
                end--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) return false;

            start++;
            end--;
        }

        return true;
        
    }
}
// @lc code=end

