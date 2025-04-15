/*
 * @lc app=leetcode id=155 lang=java
 * @lcpr version=30103
 *
 * [155] Min Stack
 * 这道题目要求通过getMin()能够以O(1)的速度得到最小值.
 * 
 * Solution: 
 * 1) maintain two stacks
 * 2) 每次push()存储一个一维数组{val,min}
 */

// @lc code=start

import java.util.Stack;

class MinStack {

    Stack<int[]> stack;

    int min;

    MinStack() {
        stack = new Stack<>();
    }

    void push(int val) {
      
        min = stack.isEmpty()? val : Math.min(val, stack.peek()[1]);
        stack.push(new int[] {val,min});
    }

    void pop() {
        stack.pop();
    }

    int top() {
        return stack.peek()[0];
    }

    int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end



