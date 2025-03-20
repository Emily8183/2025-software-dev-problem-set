/*
 * @lc app=leetcode id=856 lang=java
 * @lcpr version=30104
 *
 * [856] Score of Parentheses
 * stack.push(stack.pop() + newScore) 让得分不断向外层累加
 * 
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {

        //  (()(()))

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 初始分数为0

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); //"0,0,0"
            } else {
                int top = stack.pop(); //弹出当前层的得分

                //此时有两种可能性:
                //1)弹出的top为0,Math.max取1,newScore为1; 
                //2)弹出的top大于0,说明已经有嵌套,所以newScore为2 * top

                //(()  "0,0,0" => 0 + 1 => "0,1"
                //(()((  "0,1,0,0"
                //(()(() "0,1,1"
                //(()(()) "0,1,2" => "1+2=3" => "0,3"
                //(()(())) "0,3" => "0 + 3 * 2 = 6" 
                int newScore = Math.max(2 * top, 1); 
                stack.push(stack.pop() + newScore); //这一步很关键,要把当前层的数字累加到上一层的分数
            }
        }

        return stack.pop();
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "(())"\n
// @lcpr case=end

// @lcpr case=start
// "()()"\n
// @lcpr case=end

 */

