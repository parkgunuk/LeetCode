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
    public int maxLevelSum(TreeNode root) {
    
        Queue<TreeNode> q = new LinkedList<>();
        
        int level = 0;
        int val = Integer.MIN_VALUE;
        int res = level;
        
        q.add(root);
        while(!q.isEmpty()){
            int qLength = q.size();
            int sum = 0;
            level++;
            
            while(qLength-->0){
                TreeNode n = q.poll();
                sum += n.val;
                
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            
            if(sum > val){
                val = sum;
                res = level;
            }
        }
        
        return res;
    }
    
    
}