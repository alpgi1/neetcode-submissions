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
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        seen.add(0);
        list.add(root.val);
        search(root.right, list, seen, 1);
        search(root.left, list, seen, 1);
        return list;
    }

    public void search(TreeNode root, List<Integer> ret, HashSet<Integer> seen, int level){
        if(root != null){
        if(!seen.contains(level)){
            ret.add(root.val);
            seen.add(level);
        }
        search(root.right, ret, seen, level+1);
        search(root.left, ret, seen, level+1);
        }
    }
}
