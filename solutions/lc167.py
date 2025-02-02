'''
167. Two Sum II - Input Array Is Sorted

condition: numbers: List[int], non-decreasing order
goal: sum of two nums == target, return [i1,i2]
solution: 2 ptrs

WARNING: starts from index 1

'''

def twoSum(self, numbers: List[int], target: int) -> List[int]:

    left, right = 0, len(numbers)-1

    while left < right:
        sum = numbers[left] + numbers[right]

        if sum > target:
            right -= 1
        elif sum < target:
            left += 1
        else:
            return [left + 1, right + 1] #index starts from 1
        
    return []