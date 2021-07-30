class Solution {
    List<List<Integer>> res = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int[] visited = new int[candidates.length];
        getCombination(candidates, target, 0, 0, new ArrayList<>(), visited);
        
        return res;
    }
    
    public void getCombination(int[] arr, int target, int idx, int sum, List<Integer> list, int[] visited){
        if(arr.length < idx) return;
        if(sum > target ) return;
        
        if(sum == target){
            if(!set.contains(list.toString())){
                set.add(list.toString());
                res.add(new ArrayList(list));
                return;
            }
        }
        
        for(int i = idx ; i < arr.length ; ++i){
            if(i > idx && arr[i] == arr[i-1]) continue;
                
            list.add(arr[i]);
            getCombination(arr, target, i+1, sum + arr[i], list, visited);
            list.remove(list.size() - 1);
            
        }
    }
}