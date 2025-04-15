/*
 * @lc app=leetcode id=606 lang=java
 * @lcpr version=30104
 *
 * [606] Construct String from Binary Tree
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
 * 
 * Stringbuiler
 * parameter
 */
class Solution {
    public String tree2str(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        dfs(root, sb);
        
        return sb.toString(); 
    }

    private void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;

        sb.append(node.val);

        //如果没有节点
        if (node.left == null && node.right == null) {
            return;
        }

        //如果有左节点
        if (node.left != null) {
            sb.append("(");
            dfs(node.left,sb);
            sb.append(")");
        } else if (node.right != null) { //左节点为空，右节点不为空
            sb.append("()");
        }

        //如果有右节点
        if (node.right != null) {
            sb.append("(");
            dfs(node.right,sb);
            sb.append(")");
        }

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4]\n
// @lcpr case=end

 */

