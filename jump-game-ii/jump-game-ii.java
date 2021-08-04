class Solution {
    public int jump(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        
        for(int i = 0 ; i < nums.length ; ++i){
            for(int j = 1 ; j <= nums[i] ; ++j){
                if(i + j >= nums.length) break;
                res[i + j] = Math.min(res[i + j], res[i] + 1);
            }
        }
        
        return res[nums.length - 1];
    }
}