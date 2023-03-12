class TicTacToe {
    int[][] board;
    int n;
    public TicTacToe(int n) {
        this.n = n;
        this.board = new int[n][n];
    }
    
    public int move(int row, int col, int player) {
        board[row][col] = player;
        
        if(row == col){
            boolean hasWon = true;
            for(int i = 0; i < n; i++) {
                if(board[i][i] != player){hasWon=false;break;}
            }
            if(hasWon)return player;
        }
        if(row + col == n-1) {
            boolean hasWon = true;
            for(int i = 0; i < n; i++) {
                if(board[i][n-i-1] != player){hasWon=false;break;}
            }
            if(hasWon)return player;
        }

        boolean hasWon = true;
        for(int i = 0; i < n; i++) {
            if(board[row][i]!=player){
                hasWon=false;break;
            }
        }
        if(hasWon)return player; 
        hasWon = true;   
        for(int i = 0; i < n; i++) {
            if(board[i][col]!=player){
                hasWon=false;break;
            }
        }
        if(hasWon)return player;
        else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
