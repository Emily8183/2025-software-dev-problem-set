#
# @lc app=leetcode id=15 lang=python3
#
# [15] 3Sum
'''
condition: List[int] nums, find nums[i] + nums[j] + nums[k] == 0
no duplicate
goal: return 3 numbers
solution: two pointers

nums = [-1,0,1,2,-1,-4]
        i left     right

Warning: 去重；


'''

#

# @lc code=start
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        res = []

        for i in range(len(nums)-2):

            # remove duplicates
            if i > 0 and nums[i-1] == nums[i]: continue

            left, right = i+1, len(nums)-1

            while left < right:
            
                sum = nums[i] + nums[left] + nums[right]

                if sum > 0:
                    right -= 1
                elif sum < 0:
                    left += 1
                else:
                    res.append([nums[i], nums[left], nums[right]])

                    # remove duplicates: while i == left
                    # 注意这里要保留 left < right，因为数字可能产生变化
                    while left < right and nums[left] == nums[left+1]:
                        left += 1

                    while left < right and nums[right] == nums[right-1]:
                        right -= 1 
                        
                    left += 1
                    right -= 1

        return res
            
        


        
# @lc code=end