/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surrounded_regions;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public void solve(char[][] board){
        // Get board dimensions
        int m = board.length;
        int n = board[0].length;
        
        // Mark all 'O's on the border as 'T' (temporary)
        // These 'O's are connected to the board's edge and should not be flipped to 'X'
        for (int x = 0; x < m; x++){
            if (board[x][0] == 'O') dfs(board, x, 0);           
            if (board[x][n-1] == 'O') dfs(board, x, n-1);
        }
        
        for (int y = 0; y < n; y++){
            if (board[0][y] == 'O') dfs(board, 0, y);
            if (board[m-1][y] == 'O') dfs(board, m-1, y);
        }
        
        // Flip all remaining 'O's to 'X' (surrounding regions)
        // and change all 'T's back to 'O' (connected to the border)
        for (int x = 0; x < m; x++){
            for (int y = 0; y < n; y++){
                if (board[x][y] == 'O') board[x][y] = 'X';
                else if (board[x][y] == 'T') board[x][y] = 'O';
            }
        }
    }
    
    private void dfs(char[][] board, int row, int col){
        // Base cases: out of bounds or not 'O'
        if (    row < 0 || row >= board.length
                || col < 0 || col >= board[0].length
                || board[row][col] != 'O' ){ 
            return;
        }
        
        // Mark the current cells as 'T' (temporary)
        board[row][col] = 'T';
        
        // Recursively explore neighbors
        dfs(board, row + 1, col);   // Down
        dfs(board, row - 1, col);   // Up
        dfs(board, row, col + 1);   // Right
        dfs(board, row, col - 1);   // Left
    }
}
