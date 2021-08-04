class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        
        int[] visited = new int[n];
        rec(nums, 0, new ArrayList<>());

        
        return res;
    }
    
    public void rec(int[] nums, int idx, List<Integer> list ){
        
            List<Integer> tmp = new ArrayList(list);
            Collections.sort(tmp);
            String s = tmp.toString();
        
            if(!set.contains(s)) {
                set.add(s);
                res.add(tmp);
            }
        
        
        for(int i = idx ; i < nums.length ; ++i){
            list.add(nums[i]);
            rec(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}