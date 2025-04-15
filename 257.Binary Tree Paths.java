/*
 * @lc app=leetcode id=257 lang=java
 * @lcpr version=30104
 *
 * [257] Binary Tree Paths
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

    //backtracking
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> resList = new ArrayList<>();
        
        List<Integer> path = new ArrayList<>();
 
        dfs(root, path, resList);
 
        return resList;
 
     }
 
     private void dfs(TreeNode node, List<Integer> path, List<String> resList) {
 
         if (node == null) return;

         path.add(node.val); //不断加入node
 
         if(node.left == null && node.right == null) { //如果遇到叶子节点，可以直接返回
            resList.add(pathToString(path));
            //return; 这里的return会导致：在碰到左子树的叶子节点后直接返回整个递归栈，导致跳过了右子树。
         } else {
            dfs(node.left, path, resList);
            dfs(node.right, path, resList);
         }
            
            path.remove(path.size()-1);
         }

     private String pathToString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < path.size()-1; i++) {
            sb.append(path.get(i));
            sb.append("->");
        }

        sb.append(path.get(path.size()-1));

        return sb.toString();
     }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,5]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

