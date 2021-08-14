class Solution {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        
        int[] row = new int[R];
        int[] col = new int[C];
        
        for(int r = 0 ; r < R ; ++r){
            for(int c = 0 ; c < C ; ++c){
                if(matrix[r][c] == 0){
                    row[r] = 1;
                    col[c] = 1;
                }
            }
        }
        
        for(int c = 0 ; c < C ; ++c){
            if(col[c] == 0) continue;
            
            for(int r = 0 ; r < R ; ++r) matrix[r][c] = 0;
        }
        
        for(int r = 0 ; r < R ; ++r){
            if(row[r] == 0) continue;
            for(int c = 0 ; c < C ; ++c) matrix[r][c] = 0;
        }
    }
}