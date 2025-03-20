/*
 * @lc app=leetcode id=682 lang=java
 * @lcpr version=30104
 *
 * [682] Baseball Game
 * String[] operations
 * int x: new score
 * +: sum, stack.pop() + stack.pop();
 * D: double, 2 * stack.pop(), then .push
 * C: stack.pop()
 * if list.isEmpty(), return 0
 * 
 * 注意:
 * 1) == 只比较引用地址，而不是字符串的内容, 所以字符串的比较应该用.equals()
 * 2) 仔细了解题意,什么时候用peek什么时候用pop
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        int total_sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (String str : operations) {
            // if (!stack.isEmpty() && str.equals("C")) { //C前面肯定合法,不需要再check了
            if (str.equals("C")) {
                stack.pop();

            } else if (str.equals("D")) {

                int double_num = stack.peek() * 2;
                stack.push(double_num);

            } else if (!stack.isEmpty() && str.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.peek(); //不需要弹出

                int sum = num1 + num2;

                stack.push(num1);
                stack.push(sum);

            } else {
                stack.push(Integer.parseInt(str));
            }

        }
        
        for (int num : stack) {
            total_sum += num;

        }

        return total_sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["5","2","C","D","+"]\n
// @lcpr case=end

// @lcpr case=start
// ["5","-2","4","C","D","9","+","+"]\n
// @lcpr case=end

// @lcpr case=start
// ["1","C"]\n
// @lcpr case=end

 */

