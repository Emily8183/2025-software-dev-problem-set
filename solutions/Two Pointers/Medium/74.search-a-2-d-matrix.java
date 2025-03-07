/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 * 
 * condition: 
 * 2d matrix
 * goal: find the target num
 * solution: binary search cuz all the nums in an order
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //edge case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int m = matrix[0].length, n = matrix.length; //纵向：m列，横向：n排
        int start = 0, end = m * n -1;

        while (start <= end) { //左闭右闭
            int mid_index = start + (end-start)/2;
            int mid = matrix[mid_index / m][mid_index % m];

            if (mid == target) {
                return true;
            } else if (mid < target) {
                start = mid_index + 1;
                
            } else if (mid > target) {
                end = mid_index - 1;
                
            }

        }

        return false;

    }
}
// @lc code=end

