class Solution {
    boolean res = false;
    
    public boolean stoneGame(int[] piles) {
        Deque<Integer> deq = new ArrayDeque<>();
        
        for(int i : piles) deq.add(i);
        
        rec(deq, 0, 0);
        
        return res;
    }
    
    public void rec(Deque<Integer> deq, int a, int b){
        if(res) return;
        
        if(!deq.isEmpty() && a == b){
            res = true;
            
            return;
        }
        
        int f = deq.poll();
        int l = deq.pollLast();
        
        rec(deq, a + f, b + l);
        rec(deq, a + l, b + f);
        
    }
}