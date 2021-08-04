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
    
    List<List<Integer>> res = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        rec(root, targetSum, new ArrayList<>());
        
        return res;
    }
    
    public void rec(TreeNode cur, int targetSum, List<Integer> list){
        
        if(cur == null) return;
        
        list.add(cur.val);
        if (cur.left == null && cur.right == null && cur.val == targetSum) res.add(new ArrayList(list));
        else {
            rec(cur.left, targetSum - cur.val, list);
            rec(cur.right, targetSum - cur.val, list);
        }
        list.remove(list.size() - 1);
    }
}