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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        search(root, maxHeap, k);
        return maxHeap.peek();
    }
    public void search(TreeNode root, Queue<Integer> maxHeap, int k){
        if(root == null) return;
        maxHeap.offer(root.val);
        if(maxHeap.size() > k) maxHeap.poll();
        search(root.left, maxHeap, k);
        search(root.right, maxHeap, k);
    }
}
