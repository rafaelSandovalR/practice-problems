/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_of_life;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    private int[][] DIRS = new int[][]{ {-1,-1},// Above Left
                                        {-1,0}, // Straight Above
                                        {-1,1}, // Above Right
                                        {0,-1}, // Immediate Left
                                        {0,1},  // Immediate Right
                                        {1,-1}, // Below Left
                                        {1,0},  // Straight Below
                                        {1,1}}; // Below RIght
    
    public void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                // Convert any 1's to 10's
                if (board[row][col] > 0) board[row][col] = 10;
            }
        }
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                // Determine how many surrounding cells are living
                int neighbors = liveNeighbors(board, row, col);
                // Add living neighbor value to current cell value (0 or 10)
                board[row][col] += neighbors;
            }
        }
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                int cell = board[row][col];
                // Case cell == 3 : cell was originally 0 and had 3 living neighbors
                // Case cell == 12 : cell was originally 1 and had 2 living neighbors
                // Case cell == 13 : cell was originally 1 and had 3 living neighbors
                if (cell == 3 || cell == 12 || cell == 13) board[row][col] = 1;
                else board[row][col] = 0;
            }
        }
    }
    
    private int liveNeighbors(int[][] board, int row, int col){
        int m = board.length, n = board[0].length;
        int nextRow = 0, nextCol = 0;
        int neighbors = 0;
        
        // Loop through each surrounding directions
        for (int[] dir : DIRS){
            nextRow = row + dir[0];
            nextCol = col + dir[1];
            
            if (    nextRow >= 0 && nextRow < m         // Check if row is within range
                    && nextCol >= 0 && nextCol < n      // Check if column is within range
                    && board[nextRow][nextCol] / 10 > 0){ // If both are, determine if neighbor is currently living (anything 10 and over)
                neighbors++;
            }
        }
        
        return neighbors;
    }
}
