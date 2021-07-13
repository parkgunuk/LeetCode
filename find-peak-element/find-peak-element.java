class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int peak = 0;
        for(int i = 1 ; i < len ; ++i){
            if(nums[i] > nums[i-1]){
                peak = i;
            }
        }
        
        return peak;
    }
}