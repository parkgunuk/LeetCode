class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length > 0) {
            int sum = nums[0];
            int maxsum = nums[0];
            
            for(int i = 1 ; i < nums.length ; ++i){
                sum += nums[i];
                if(sum < nums[i]) sum = nums[i];
                maxsum = Math.max(maxsum, sum);
                
            }
            
            return maxsum;
        }
        
        return 1;
    }
}