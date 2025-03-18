package solutions.Stack.Easy;
/*
 * @lc app=leetcode id=20 lang=java
 * @lcpr version=30103
 *
 * [20] Valid Parentheses
 */

import java.util.Stack;

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        if (s == null || s.length() == 0 || s.length() == 1) return false; 

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
               if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        return stack.isEmpty();
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "()[]{}"\n
// @lcpr case=end

// @lcpr case=start
// "(]"\n
// @lcpr case=end

// @lcpr case=start
// "([])"\n
// @lcpr case=end

 */

