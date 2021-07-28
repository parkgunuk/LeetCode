class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums.length < 4 ) return res;
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0 ; i < n - 3 ; ++i){
            for(int j = i + 1 ; j < n-2 ; ++j){
                int l = j + 1;
                int r = n - 1;
                
                while(l < r){
                    int val = nums[i] + nums[j] + nums[l] + nums[r];
                    
                    if(val == target){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[l]);
                        tmp.add(nums[r]);
                        
                        if(res.contains(tmp) == false){
                            res.add(tmp);
                        }
                        r--;
                        l++;
                    } else if(val > target) r--;
                    else if(val < target) l++;
                } 
            }
        }
        
        return res;
    }
}