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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode xp = null;
        TreeNode yp = null;
        int depth = 0;
        
        while(!q.isEmpty()){
            int len = q.size();
            depth++;
            while(len-->0){
                TreeNode t = q.poll();
            
                if(t.left != null){
                    q.add(t.left);
                    if(t.left.val == x) xp = t;
                    if(t.left.val == y) yp = t;
                }
                
                if(t.right != null){
                    q.add(t.right);
                     if(t.right.val == x) xp = t;
                    if(t.right.val == y) yp = t;
                }
                
                if(xp != null && yp != null) break;
            }
            
            if(xp != null && yp != null) return xp != yp;
            if((xp != null && yp == null) || (xp == null && yp != null)) return false;
        }
        return false;
    }
}