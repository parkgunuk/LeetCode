class Solution {
    
    HashSet<String> set = new HashSet<>();
    List<List<Integer>> res = new ArrayList<>();
        
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        rec(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }
    
    public void rec(int[] arr, int target, int sum, int idx, List<Integer> list){
        if(sum > target) return;
        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;   
        }
        
        
        for(int i = idx ; i < arr.length ; ++i){
            int tmp = sum + arr[i];
            if(tmp <= target) {
                list.add(arr[i]);
                rec(arr, target, tmp, i, list);
                list.remove(list.size()-1);        
            } 
        }
    }
}