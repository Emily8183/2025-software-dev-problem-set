/*
 * @lc app=leetcode id=232 lang=java
 * @lcpr version=30103
 *
 * [232] Implement Queue using Stacks
1) Correct Approach: You should only transfer elements from stack1 to stack2 when stack2 is empty, and when performing pop/peek operations.
2) Not only transfer one element from stack1, transfer all -> (if (stack2.isEmpty()))
3) The queue is empty if BOTH stacks are empty

 */

// @lc code=start

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
        
    }
    
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
    
    public boolean empty() {
        // The queue is empty if BOTH stacks are empty
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end



