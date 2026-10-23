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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashSet<TreeNode> pSet = new HashSet<>();
        Stack<TreeNode> qStack = new Stack<>();

        TreeNode pT = root;
        while(true){
            pSet.add(pT);
            if(pT.val == p.val) break;
            if(pT.val > p.val){
                pT = pT.left;
            }else pT = pT.right;
        }
        TreeNode qT = root;
        while(true){
            qStack.push(qT);
            if(qT.val == q.val) break;
            if(qT.val > q.val){
                qT = qT.left;
            }else qT = qT.right;
        }

        while(qStack.size() > 0){
            TreeNode val = qStack.pop();
            if(pSet.contains(val)) return val;
        }
        return null;
    }
}
