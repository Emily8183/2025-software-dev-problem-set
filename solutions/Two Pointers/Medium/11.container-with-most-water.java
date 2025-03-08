/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 * DP: 原理就是，出现短的那一头，就移动一下，看看下一根是否会高。
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int max_area = 0;

        while (left < right) {

            int length = right - left;
            int width = Math.min(height[left], height[right]);

            int area = length * width;

            if (height[left] > height[right]) right--;
            else left++;

            max_area = Math.max(max_area, area);
        }

        return max_area;
     
        
    }
}
// @lc code=end

