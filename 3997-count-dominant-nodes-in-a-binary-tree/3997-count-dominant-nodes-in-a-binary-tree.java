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
    int count=0; 
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    public int dfs(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }

        int left=dfs(node.left);
        int right=dfs(node.right);

        int max=Math.max(node.val , Math.max(left,right));

        if(max==node.val){
            count++;
        }
        return max;
    }
}