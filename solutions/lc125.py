'''
125. Valid Palindrome

condition: s: str, with uppercase letters & non-alphanumeric chars
goal: isPalindrome, after removing non-alphanumeric chars, & converting uppercase to lowercase by lower() method
solution: two ptrs
1) faster pointer handles data
2) slow pointer collects data
3) bool
'''

def isPalindrome(self, s: str) -> bool:
    start, end = 0, len(s)-1

    # my code:
    # while start < end:
    #     if s[start].isalnum():
    #         if s[end].isalnum():
    #             if s[start].lower() == s[end].lower():
    #                 end -= 1
    #                 start +=1
    #             else: return False
    #         else: end -= 1
    #     else: start += 1

    # return True

    # gpt's code:
    while start < end:
        while start < end and not s[start].isalnum():
            start += 1
        
        while start < end and not s[end].isalnum():
            end -= 1

        if s[start].lower() != s[end].lower():
            return False

        start += 1
        end -= 1
    
    return True