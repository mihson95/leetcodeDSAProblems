// min path sum in grid

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(res[i],0);
        }
        res[0][0] = grid[0][0];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == 0 && j != 0) res[i][j] = grid[i][j] + res[i][j-1];
                else if(i != 0 && j == 0) res[i][j] = grid[i][j] + res[i-1][j]; 
                else if(i != 0 && j != 0) res[i][j] = grid[i][j] + Math.min(res[i-1][j], res[i][j-1]);
            }
        }
        return res[n-1][m-1];
    }
}
