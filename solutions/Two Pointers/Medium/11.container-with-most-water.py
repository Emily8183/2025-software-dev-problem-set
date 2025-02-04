#
# @lc app=leetcode id=11 lang=python3
#
# [11] Container With Most Water
#

'''
condition: List[int] height, length = n
goal: get the max size
solution: 2ptrs
'''

# @lc code=start
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_size = 0

        left, right = 0, len(height)-1

        while left < right:

            current_height = min(height[left], height[right])

            # 宽度（右指针 - 左指针
            size = (right-left) * current_height

            max_size = max(max_size, size)

            if height[left] < height[right]:
                left += 1
            else: right -= 1

        return max_size


        
# @lc code=end

