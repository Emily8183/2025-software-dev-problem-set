/*
 * @lc app=leetcode id=150 lang=java
 * @lcpr version=30104
 *
 * [150] Evaluate Reverse Polish Notation
 * TC: O(n), SC: O(n)
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if (str.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num1 + num2);
            }  else if (str.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 - num1);
            } else if (str.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num1 * num2);
            } else if (str.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 / num1);
            } else {
                stack.push(Integer.parseInt(str));
            }


        }

        return stack.pop();

    }
}
// @lc code=end



/*
// @lcpr case=start
// ["2","1","+","3","*"]\n
// @lcpr case=end

// @lcpr case=start
// ["4","13","5","/","+"]\n
// @lcpr case=end

// @lcpr case=start
// ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]\n
// @lcpr case=end

 */

