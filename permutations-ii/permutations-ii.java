class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        int N = nums.length;
        int[] visited = new int[N];
        List<Integer> list = new ArrayList<>();
        getPermutation(nums, N, 0, visited, list);
        
        return res;
    }
    public void getPermutation(int[] nums, int len, int cnt, int[] visited, List<Integer> list){
        if(len == cnt){
            if(!set.contains(list.toString())){
                set.add(list.toString());
                res.add(new ArrayList(list));
                
            }
            return;
        }
        
        for(int i = 0 ; i < len ; ++i){
            if(visited[i] == 1) continue;
            
            visited[i] = 1;
            list.add(nums[i]);
            getPermutation(nums, len, cnt + 1, visited, list);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }
}