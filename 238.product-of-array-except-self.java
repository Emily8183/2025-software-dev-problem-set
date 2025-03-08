/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 * 1) two traversals, forward and backward
 * 2) use cur to temporarily save the product
 * 
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;

        int cur = result[0];

        for (int i = 0; i < nums.length; i++) {
            result[i] = cur;
            cur *= nums[i];
        }

        cur = 1;

        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= cur;
            cur *= nums[i];
        }

        return result;
  
    }
}
// @lc code=end

