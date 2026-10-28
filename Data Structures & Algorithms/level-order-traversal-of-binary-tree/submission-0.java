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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        list.add(l);
        search(list, 1, root.left);
        search(list, 1, root.right);
        return list;
    }

    public void search(List<List<Integer>> list, int level,TreeNode root){
        if(root == null) return;

        if(list.size() > level){
            List<Integer> l = list.get(level);
            l.add(root.val);
        }else{
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            list.add(l);
        }
        search(list, level+1, root.left);
        search(list, level+1, root.right);
    }
}
