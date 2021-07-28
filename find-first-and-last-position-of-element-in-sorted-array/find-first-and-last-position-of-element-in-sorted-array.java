class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);
        
        int l = 0;
        int r = nums.length - 1;
        
        while(l <= r){
            int mid = (l+r)>>1;
            
            if(nums[mid] == target){
                
                for(int i = l ; i <= mid ; ++i ){
                    if(nums[i] == target) {
                        res[0] = i;
                        break;
                    }
                }
                for(int i = r ; r >= mid ; i--){
                    if(nums[i] == target){
                        res[1] = i;
                        break;
                    }
                }
                break;
                
            } else if(nums[mid] > target) r = mid - 1;
            else if(nums[mid] < target) l = mid + 1;
        }
        
        return res;
    }
}