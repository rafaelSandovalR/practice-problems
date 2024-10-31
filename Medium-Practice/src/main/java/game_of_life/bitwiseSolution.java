/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_of_life;

/**
 *
 * @author Rsand
 */
public class bitwiseSolution {
    public void gameOfLife(int[][] board){
        if (board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                int lives = liveNeighbors(board, row, col);
                int cell = board[row][col];
                
                if (cell == 1 && lives >= 2 && lives <= 3) board[row][col] = 3;
                else if (cell == 0 && lives == 3) board[row][col] = 2;
            }
        }
        
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                board[row][col] >>= 1;
            }
        }
    }
    
    private int liveNeighbors(int[][] board, int row, int col){
        int m = board.length, n = board[0].length;
        int lives = 0;
        
        int startRow = Math.max(row - 1, 0);
        int endRow = Math.min(row + 1, m - 1);
        int startCol = Math.max(col, 0);
        int endCol = Math.min(col + 1, n - 1);
        
        for (int x = startRow; x <= endRow; x++){
            for (int y = startCol; y <= endCol; y++){
                lives += board[x][y] & 1;
            }
        }
        
        return lives;
    }
}
