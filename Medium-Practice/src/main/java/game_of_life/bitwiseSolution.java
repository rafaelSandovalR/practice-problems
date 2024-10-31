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
        
        // Main Loop that determines each cell's status based on surroundings
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                // Method call that returns amount of living neighbors
                int lives = liveNeighbors(board, row, col);
                int cell = board[row][col]; // current cell value
                
                
                // Prepare cells that will change, using the first bit to indicate their current state
                // and the second bit to indicate the state they will change to
                
                // If current cell is alive and there are 2 or 3 living neighbors set second bit to 1
                if (cell == 1 && lives >= 2 && lives <= 3) board[row][col] = 3; // 01 ---> 11
                // If cell is dead and there are 3 living neighbors set second bit to 1
                else if (cell == 0 && lives == 3) board[row][col] = 2; // 00 ---> 10
            }
        }
        
        // Loop to convert cells to their new state
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                board[row][col] >>= 1; // Bitwise shift to right replaces first bits (original state) with second bits (new state)
            }
        }
    }
    
    private int liveNeighbors(int[][] board, int row, int col){
        int m = board.length, n = board[0].length;
        int lives = 0;
        
        int startRow = Math.max(row - 1, 0); // Starting row (Above) will be one less than current row, or zero if current is in row 0
        int endRow = Math.min(row + 1, m - 1); // Ending row (Below) will be one more than the current row, or last board row if current is on that last row
        int startCol = Math.max(col - 1, 0); // Starting col (Left) will be one less than current col, or zero if current is in col 0
        int endCol = Math.min(col + 1, n - 1); // Ending col (Right) will be one more than the current col, or last column if current is on last column
        
        
        // Loop to count surrounding living cells, based on boundaries set above
        for (int x = startRow; x <= endRow; x++){
            for (int y = startCol; y <= endCol; y++){
                lives += board[x][y] & 1; // Bitwise AND extracts the first bit of each cell. First bits are current states
            }
        }
        
        lives -= board[row][col] & 1; // Subtract current cell from the count of living cells
        return lives;
    }
}
