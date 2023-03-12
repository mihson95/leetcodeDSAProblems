class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> rowSet = new HashSet<Integer>();
        for(int i = 0; i < 9; i++) {
            rowSet.clear();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.')continue;
                int num = board[i][j] - '0';
                if(num>9 || num < 1)return false;
                if(rowSet.contains(num))return false;
                rowSet.add(num);
            }
        }

        for(int i = 0; i < 9; i++) {
            rowSet.clear();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] == '.')continue;
                int num = board[j][i] - '0';
                if(num>9 || num < 1)return false;
                if(rowSet.contains(num))return false;
                rowSet.add(num);
            }
        }

        for(int k = 0; k < 3; k++) {
            for(int l = 0; l < 3; l++) {
                rowSet.clear();
                for(int i = 0+3*k; i < 3+3*k; i++) {
                    for(int j = 0+3*l; j < 3+3*l; j++) {
                        if(board[j][i] == '.')continue;
                        int num = board[j][i] - '0';
                        if(num>9 || num < 1)return false;
                        if(rowSet.contains(num))return false;
                        rowSet.add(num);
                    }
                }
            }
        }
        return true;

    }
}
