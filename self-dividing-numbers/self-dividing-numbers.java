class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i <= right ; ++i){
            if(isPossible(i)) res.add(i);
        }
        
        return res;
    }
    
    public boolean isPossible(int n){
        int val = n;
        while(val != 0){
            int tmp = val % 10;
            if (tmp == 0 || n % tmp != 0) return false;
            val /= 10;
        }
        
        return true;
    }
}