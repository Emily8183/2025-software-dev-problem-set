/*
 * @lc app=leetcode id=155 lang=java
 * @lcpr version=30103
 *
 * [155] Min Stack
 * 这道题目要求通过getMin()能够以O(1)的速度得到最小值.
 * 
 * Solution: maintain two stacks.
 */

// @lc code=start

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        //notice: minStack.isEmpty()
        if (minStack.isEmpty() || minStack.peek() >= val) minStack.push(val);

        stack.push(val);
    }

    public void pop() {
        // if (stack.peek() == minStack.peek()) { <= wrong syntax
        //since they are Integer objects, here we should use .equals()
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();

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



