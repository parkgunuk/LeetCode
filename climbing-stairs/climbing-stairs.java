class Solution {
    public int climbStairs(int n) {
        int prev = 0;
        int cur = 1;
        int next = 1;
        
        while(n-- > 0){
            prev = cur;
            cur = next;
            next = prev + cur;
        }
        
        return cur;
    }
}