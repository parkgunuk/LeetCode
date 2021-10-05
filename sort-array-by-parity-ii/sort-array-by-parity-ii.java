class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
    
        for(int i : nums){
            if(i%2 == 0) even.add(i);
            else odd.add(i);
        }
        
        
        int[] res = new int[even.size() + odd.size()];
        
        int idx = 0;
        for(int i = 0 ; i < res.length ; i+=2){
            res[i] = even.poll();
            res[i+1] = odd.poll();
        }
        
        return res;
    }
}