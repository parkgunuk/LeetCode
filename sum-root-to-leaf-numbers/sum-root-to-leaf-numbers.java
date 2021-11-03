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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        rec(root, 0);
        
        return sum;
    }
    
    public void rec(TreeNode cur, int val){
        System.out.println("dd : " + val);
        if(cur.left == null && cur.right == null){
            sum += (val  * 10 + cur.val);
            return;
        }
        
        if(cur.left != null) rec(cur.left, val * 10 + cur.val);
        if(cur.right != null) rec(cur.right, val * 10 + cur.val);
    }
}