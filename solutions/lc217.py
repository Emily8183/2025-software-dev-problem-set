"""
condition: nums
goal: find if one value appears more than twice, return true

"""

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        # equals to hashset in Java
        hashset = set()

        # for loop
        for num in nums:
            if num in hashset:
                return True
        # add nums[i] to dict
            hashset.add(num)
        return False