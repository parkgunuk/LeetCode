class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        
        if(target < nums[0]) return 0;
        if(target > nums[r]) return nums.length;
        
        while(l <= r){
            int mid = (l+r)>>1;
            
            if(nums[mid] == target) return mid;
            
            else if (nums[mid] > target) r = mid - 1;
            else if (nums[mid] < target) l = mid + 1;
        }
        
        return l;
    }
}