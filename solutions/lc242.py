'''
condition: str s, str t
goal: anagram <= True
solution: create an array and save the frequency
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t): return False

        #set an empty array for storing the freq of 26 letters
        freq = [0] * 26

        #loop in str s, add the frequency in the array
        for char in s:
            freq[ord[char] - ord('a')] += 1

        #loop in str t, minus the frequency in the array
        for char in t:
            freq[ord[char] - ord('a')] -= 1

        #if it turns to zero, return true
        for count in freq:
            if count != 0:
                return False
            
        return True