class Solution {
    int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    String res;
    public boolean exist(char[][] board, String word) {
        int R = board.length;
        int C = board[0].length;
        res = "";
        
        for(int r = 0 ; r < R ; ++r){
            for(int c = 0 ; c < C ; ++c){
                if(board[r][c] != word.charAt(0)) continue;
                
                Queue<int[]> q = new LinkedList<>();
                StringBuilder sb = new StringBuilder();
                sb.append(word.charAt(0));
                boolean[][] isVisit = new boolean[R][C];
                
                isVisit[r][c] = true;
                find(board, word, R, C, isVisit, r, c, 0, sb);
                if(res.equals(word)) return true;
            }
        }
        return false;
    }
    public void find(char[][] board, String word, int R, int C, boolean[][] isVisit, int r, int c, int idx, StringBuilder sb){
        // System.out.println();
        // System.out.println("R : " + r + " C : " + c + " idx : " + idx + " word : " + word.charAt(idx) + " string : " + sb.toString());
        // System.out.println("-------------------");
        //for(int i = 0 ; i < R ; ++i) System.out.println(Arrays.toString(isVisit[i]));
        
        if(sb.toString().equals(word)){
            res = word;
            return;
        }
        
        if(idx > word.length()) return;
        
        for(int i = 0 ; i < 4 ; ++i){
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            
            if(nr < 0 || nr >= R || nc < 0 || nc >= C || isVisit[nr][nc] || idx > word.length()) continue;
            
            if(board[nr][nc] == word.charAt(idx+1)){
                //System.out.println("Before === NR : " + nr + " NC : " + nc + " idx : " + idx + " word : " + word.charAt(idx) + " string : " + sb.toString());
                sb.append(board[nr][nc]);
                isVisit[nr][nc] = true;
                //System.out.println("After === NR : " + nr + " NC : " + nc + " idx : " + idx + " word : " + word.charAt(idx) + " string : " + sb.toString());

                find(board, word, R, C, isVisit, nr, nc, idx+1, sb);
                sb.setLength(sb.length() - 1);
                isVisit[nr][nc] = false;
            }
        }
    }
}