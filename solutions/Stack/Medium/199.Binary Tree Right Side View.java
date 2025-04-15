/*
 * @lc app=leetcode id=199 lang=java
 * @lcpr version=30104
 *
 * [199] Binary Tree Right Side View
 * bfs
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resList = new ArrayList<>();

        if(root == null) return resList; //记得添加判空判断

        bfs(root, resList);
        return resList;
        
    }

    private void bfs(TreeNode node, List<Integer> list) {

        
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);

        while (!queue.isEmpty()) {

            int len = queue.size();

            while (len > 0) { // 如果while (len >= 0) 会多处理一个 null
                TreeNode temp = queue.poll();

                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);

                len--;

                if (len == 0) {
                    list.add(temp.val);
                }

            }

        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,5,null,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,null,null,null,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

