class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int r = 0 ; r < n ; ++r){
            for (int c = 0 ; c < n ; ++c){
                board[r][c] = '.';
            }
        }
        
        setQueen(n, board, 0);
        
        return res;
    }
    
    public void setQueen(int n, char[][] board, int r){
        if(r == n) {
            res.add(new ArrayList(makeString(board)));
            return ;
        }
        
        for(int c = 0 ; c < n ; ++c){
            if(!checkQueen(n, board, r, c)) continue;
            
            board[r][c] = 'Q';
            setQueen(n, board, r + 1);
            board[r][c] = '.';
        }
    }
    
    public boolean checkQueen(int n, char[][] board, int r, int c){
        for(int rr = 0 ; rr < r ; ++rr){
            if(board[rr][c] == 'Q') return false;
        }
        
        for (int rr = r - 1, cc = c + 1; rr >= 0 && cc < n; rr--, cc++) {
            if (board[rr][cc] == 'Q') return false;
        }
        
        for (int rr = r - 1, cc = c - 1; rr >= 0 && cc >= 0; rr--, cc--) {
            if (board[rr][cc] == 'Q') return false;
        }
        
        return true;
    }
    
    public List<String> makeString(char[][] board){
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            tmp.add(new String(board[i]));
        }
        return tmp;
    }
}