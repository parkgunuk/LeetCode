class Solution {
    
    public int[][] updateMatrix(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        
        int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> q = new LinkedList<>();
        
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                if (mat[r][c] == 0) q.add(new int[] {r, c});
                else mat[r][c] = -1;
            }
        }
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            
            for(int i = 0 ; i < 4 ; ++i){
                int nr = cur[0] + dir[i][0];
                int nc = cur[1] + dir[i][1];
                
                if(nr < 0 || nr >= R || nc < 0 || nc >= C ) continue;
                
                if(mat[nr][nc] == -1) {
                    mat[nr][nc] = mat[cur[0]][cur[1]] + 1;
                    q.add(new int[] {nr, nc});
                }
            }    
        }
        
        return mat;
    }
    
}