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
    List<Integer>v=new ArrayList();
    List<Integer>v2=new ArrayList();
    public void go(TreeNode cur,boolean chk)
    {
        if(cur == null) return;
        if (cur.left==null && cur.right==null)
        {
            if (chk==true)
            {
                v.add(cur.val);
            }
            else
            {
                v2.add(cur.val);
            }
            return;
        }
        go(cur.left,chk);
        go(cur.right,chk);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        go(root1,true);
        go(root2,false);
        if (v.size()!=v2.size())return false;
        for (int i=0;i<v.size();i++)
        {
            if (v.get(i)!=v2.get(i))
            return false;
        }
        return true;
    }
}