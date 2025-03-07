/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 * 
 * sliding window + hashset
 * 1) set.add()
 * 2) int start = 0, int end = 
 * if (!set.add()) 
 * 3) start = i + 1
 * 4) int len = 0; Math.max(len, max);
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();

        int length_max = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            
            }

            set.add(c);

            length_max = Math.max(length_max, right-left+1);

        }

        return length_max;
        
    }
}
// @lc code=end

