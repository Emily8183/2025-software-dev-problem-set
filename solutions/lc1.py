class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        hash = {}

        #for loop： Iterating list using enumerate to get both index and element
        for i, n in enumerate(nums):
            diff = target - n

            if diff in hash:
                return [hash[diff], i]

            hash[n] = i

        return #因为这题确保有一个解，所以在Line18就会被return，这里不会被触发