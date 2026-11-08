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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        int[] count = new int[]{1};
        dfs(count, root.left, root.val);
        dfs(count, root.right, root.val);
        return count[0];
    }

    public void dfs(int[] count, TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max) count[0]++;
        dfs(count, root.left, Math.max(max, root.val));
        dfs(count, root.right, Math.max(max, root.val));
    }
}
