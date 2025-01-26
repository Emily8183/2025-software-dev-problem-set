'''
128. Longest Consecutive Sequence

condition: unsorted List[] nums
goal: longest consecutive elements sequence
solution: hashset
1, numSet = set(nums)
2, look for the smallest number, freq++
3, get the largest freq++

'''
def longestConsecutive(self, nums: List[int]) -> int:

    numSet = set(nums) #不需要map,用set就可以. 只需要一步，

    max_freq = 0

    for n in numSet:
    #这里要加一步，check if the n is the smallest in the set
        
        if (n-1) not in numSet: 
            freq = 0

            while (n+freq) in numSet:
                freq += 1
            max_freq = max(freq, max_freq)

    return max_freq







