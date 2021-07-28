class Solution {
    public int[] beautifulArray(int n) {
        int[] res = new int[n];
        
        makeArr(res, 0, n - 1, 1, 1);
        
        return res;
    }
    
    public void makeArr(int[] res, int s, int e, int num, int diff){
        if(num + diff > res.length){
            res[s] = num;
            return;
        }
        
        int n = num + diff;
        int ns = 1 + (s+e)/2;
        
        diff *= 2;
        
        makeArr(res, s, ns - 1, num, diff);
        makeArr(res, ns, e, n, diff);
    }
}