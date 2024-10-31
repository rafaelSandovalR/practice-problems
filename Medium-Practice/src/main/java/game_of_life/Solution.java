/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_of_life;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        
        // If board consists of a single row, no cell can possibly attain
        // requirements to continue living or generate new life
        if (m == 1){
            for (int i = 0; i < n; i++){
                board[0][i] = 0;
            }
            return; // Convert board to all zeroes and return
        }
        
        // Loop to determine cell fate and convert using game rules
        for (int row = 0; row < m; row++){
            
            // Array with flags indicating which surrounding squares to ommit from check;
            // 0-Top Left       1-Top Middle    2-Top Right
            // 3-Middle left                    4-Middle Right
            // 5-Bottom Left    6-Bottom Mid    7-Bottom Right
            boolean[] omitScan = new boolean[8];
            
            
            for(int col = 0; col < n; col++){
                setOmit(omitScan, m, n, row, col); // Determine surrounding squares to omit    
                playLife(board, omitScan, row, col); // Determine if cell is living or dead based on surrounding cells
            }
        }
        
        // Loop to convert coded cells
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                if (board[row][col] == -1) board[row][col] = 1; // Convert -1s to 1s
                else if (board[row][col] == 2) board[row][col] = 0; // Convert 2s to 0s
            }
        }
    }
    
    // Method to apply game rules based on appropriate surrounding cells
    private void playLife(int[][] board, boolean[] omitScan, int row, int col){
        
        int[] neighbors = new int[8]; // Array holding neighbor values
        boolean currentIsAlive = board[row][col] == 1; // Current cell's status
            
        if (!omitScan[0]) neighbors[0] = board[row - 1][col - 1]; // Above to the left
        if (!omitScan[1]) neighbors[1] = board[row - 1][col]; // Immediate above
        if (!omitScan[2]) neighbors[2] = board[row - 1][col + 1]; // Above to the right

        if (!omitScan[3]) neighbors[3] = board[row][col - 1]; // Immediate left
        if (!omitScan[4]) neighbors[4] = board[row][col + 1]; // Immediate right

        if (!omitScan[5]) neighbors[5] = board[row + 1][col - 1]; // Below to the left
        if (!omitScan[6]) neighbors[6] = board[row + 1][col]; // Immediate below
        if (!omitScan[7]) neighbors[7] = board[row + 1][col + 1]; // Below to the right
        
        int living = 0; // Amount of living neighbors
        for (int i = 0; i < 8; i++){
            // Using the code below, values greater than zero are living 
            // otherwise they are dead
            living += neighbors[i] > 0 ? 1 : 0;
        }
        
        // CODE:
        // -1 = Dead cell that will change to living 0->1
        // 2  = Living cell that will change to dead 1->0
        // Cells that don't change just stay as 1 or 0
        
        if (currentIsAlive){
            if (living < 2 || living > 3) board[row][col] = 2;
        } else{
            if (living == 3) board[row][col] = -1;
        }

    }
    
    private void setOmit(boolean[] omitScan,int m, int n, int row, int col){
        
        // For first row, omit anything above
        if (row == 0) {
            omitScan[0] = true;
            omitScan[1] = true;
            omitScan[2] = true;
        }
        
        // For last row, omit anything below
        if (row == m - 1) {
            omitScan[5] = true;
            omitScan[6] = true;
            omitScan[7] = true;
        }
        
        // For first column, omit anything to the left
        if (col == 0) {
            omitScan[0] = true;
            omitScan[3] = true;
            omitScan[5] = true;
        }
        
        // For first column
        if (col == 1) {
            if (row > 0) omitScan[0] = false; // Revert above left omission only after first row
            omitScan[3] = false; // Revert immediate left omission
            if (row < m - 1) omitScan[5] = false; // Revert bottom left omission only before last row
        }

        // For last column, omit anything to the right
        if (col == n - 1) {
            omitScan[2] = true;
            omitScan[4] = true;
            omitScan[7] = true;
        }
    }
}
