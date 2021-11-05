class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        
        long m;
        long c;
        while(l <= r){
            m = l + (r - l) / 2;
            c = (m + 1) * m / 2;
            
            if(c == n) return (int) m;
            
            if(n < c) r = m - 1;
            else l = m + 1;
        }
        return (int) r;
    }
}