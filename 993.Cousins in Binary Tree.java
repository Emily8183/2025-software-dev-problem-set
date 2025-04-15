/*
 * @lc app=leetcode id=993 lang=java
 * @lcpr version=30104
 *
 * [993] Cousins in Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
        TreeNode parentX = null, parentY = null;
        int depthX = 0, depthY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        traversal(root, null, 0, x, y);
        return depthX == depthY && parentX != parentY;
    }

    public void traversal(TreeNode node, TreeNode parent, int depth, int x, int y) {

        if (node == null) return;

        traversal(node.left, node, depth+1, x, y);
        traversal(node.right, node, depth+1, x, y);

        if (node.val == x) {
            parentX = parent;
            depthX = depth;
        }

        if (node.val == y) {
            parentY = parent;
            depthY = depth;
        }
    }
        
    
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n4\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4,null,5]\n5\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4]\n2\n3\n
// @lcpr case=end

 */

