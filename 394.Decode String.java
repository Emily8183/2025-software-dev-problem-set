/*
 * @lc app=leetcode id=394 lang=java
 * @lcpr version=30103
 *
 * [394] Decode String
 * 我们用两个栈，一个存 repeat 次数，一个存 [ 前的部分字符串。每次遇到 ] 时，我们从栈里取出拼接，最终得到解码字符串。
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Stack<Integer> k_stack = new Stack<>();
        Stack<String> disc = new Stack<>();

        StringBuilder curStr = new StringBuilder();
        int num = 0;

        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c-'0');
            } else if (c == '[') {
                k_stack.push(num);
                disc.push(curStr.toString()); //遇到嵌套时，先把之前的元素在disc Stack中保存一下
                curStr = new StringBuilder();//reset
                num = 0;//reset
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(disc.pop()); //从栈里取出拼接
                int repeat = k_stack.pop();

                temp.append(curStr.toString().repeat(repeat));
                curStr = temp;
            } else {
                curStr.append(c); //清零后的curStr append新的字母
            }
        }

        return curStr.toString();
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// "3[a]2[bc]"\n
// @lcpr case=end

// @lcpr case=start
// "3[a2[c]]"\n
// @lcpr case=end

// @lcpr case=start
// "2[abc]3[cd]ef"\n
// @lcpr case=end

 */

