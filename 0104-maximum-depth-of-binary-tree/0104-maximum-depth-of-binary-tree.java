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
    public int go(TreeNode cur)
    {
        if (cur==null) return 0;
        int ret=0;
        ret=Math.max(ret,Math.max(go(cur.left),go(cur.right)))+1;
        return ret;
    }
    public int maxDepth(TreeNode root) {
        return go(root);        
    }
}