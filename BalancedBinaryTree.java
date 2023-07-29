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
    private boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        calcHeight(root);
        return ans;
    }

    public int calcHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = calcHeight(root.left);
        int right = calcHeight(root.right);
        if(Math.abs(left - right) > 1) {
            ans = false;;
        } 
        return (Math.max(left, right) + 1);
    }
}
