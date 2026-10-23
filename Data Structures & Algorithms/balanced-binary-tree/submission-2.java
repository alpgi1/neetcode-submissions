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
    public boolean isBalanced(TreeNode root) {
        int[] ret = new int[]{0};
        dfs(root,ret);
        if(ret[0] == -1) return false;
        return true;
    }

    public int dfs(TreeNode root, int[] ret){
        if(root == null) return 0;

        int left = dfs(root.left, ret);
        int right = dfs(root.right, ret);

        if(right - left < -1 || right - left > 1) ret[0] = -1;

        return Math.max(left, right) +1;
    }
}
