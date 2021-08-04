class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int C = matrix[0].length;
        int R = matrix.length;
        
        List<Integer> res = new ArrayList<>();
        
        int rr = 0;
        int cc = 0;
        int r = R-1;
        int c = C-1;
        
        while(rr <= r && cc <= c){
            // left to right
            for(int i = cc ; i <= c; ++i) res.add(matrix[rr][i]);
            rr++;
            // top to bottom
            for(int i = rr ; i <= r ; ++i) res.add(matrix[i][c]);
            c--;
            
            if(r < rr) break;
            
            // right to left
            for(int i = c ; i >= cc ; i--) res.add(matrix[r][i]);
            r--;
            
            if(c < cc) break;
            
            // bottom to top
            for(int i = r ; i >= rr ; i--) res.add(matrix[i][cc]);
            cc++;
        }
        
        return res;
    }
    
}