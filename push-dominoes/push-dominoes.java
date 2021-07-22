class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int l = 0;
        int r = 1;
        
        char[] res = dominoes.toCharArray();
        
        while(r < n){
            while(r < n && res[r] == '.') r++;
            if(r == n) break;
            
            if(res[l] == '.' && res[r] == 'L') {
                while(l < r) res[l++] = 'L';
                r++;
            } else if(res[l] == 'L' && res[r] == 'R'){
                l = r;
                r += 1;
            } else if(res[l] == 'R' && res[r] == 'L') {
                int tmp = r;
                while(l < tmp) {
                    res[l++] = 'R';
                    res[tmp--] = 'L';
                }
                l = r;
                r += 1;
            } else if(res[l] == 'L' && res[r] == 'L') {
                while (l < r) res[l++] = 'L';
                r += 1;
            } else if(res[l] == '.' && res[r] == 'R') {
                l = r;
                r += 1;
            } else if(res[l] == 'R'){
                while(l < r) res[l++] = 'R';
                r += 1;
            }
        }
        
        if(l < n - 1 && res[l] == 'R'){
            while(l < n) res[l++] = 'R';
        }
        
        return new String(res);
    }
}