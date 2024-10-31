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
        
        if (m == 1){
            for (int i = 0; i < n; i++){
                board[0][i] = 0;
            }
            return;
        }
        
        
        for (int row = 0; row < m; row++){
            
            // Array with flags indicating which surrounding squares to ommit from check;
            // 0-Top Left       1-Top Middle    2-Top Right
            // 3-Middle left                    4-Middle Right
            // 5-Bottom Left    6-Bottom Mid    7-Bottom Right
            boolean[] omitScan = new boolean[8];
            
            
            for(int col = 0; col < n; col++){
                setOmit(omitScan, m, n, row, col);
                                
                playLife(board, omitScan, row, col);
            }
        }
        
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                if (board[row][col] == -1) board[row][col] = 1;
                else if (board[row][col] == 2) board[row][col] = 0;
            }
        }
    }
    
    private void playLife(int[][] board, boolean[] omitScan, int row, int col){
        
        int[] neighbors = new int[8];
        boolean currentAlive = board[row][col] == 1;
            
        if (!omitScan[0]) neighbors[0] = board[row - 1][col - 1];
        if (!omitScan[1]) neighbors[1] = board[row - 1][col];
        if (!omitScan[2]) neighbors[2] = board[row - 1][col + 1];

        if (!omitScan[3]) neighbors[3] = board[row][col - 1];
        if (!omitScan[4]) neighbors[4] = board[row][col + 1];

        if (!omitScan[5]) neighbors[5] = board[row + 1][col - 1];
        if (!omitScan[6]) neighbors[6] = board[row + 1][col];
        if (!omitScan[7]) neighbors[7] = board[row + 1][col + 1];
        
        int living = 0;
        for (int i = 0; i < 8; i++){
            living += neighbors[i] > 0 ? 1 : 0;
        }
        
        if (currentAlive){
            if (living < 2 || living > 3) board[row][col] = 2;
        } else{
            if (living == 3) board[row][col] = -1;
        }

    }
    
    private void setOmit(boolean[] omitScan,int m, int n, int row, int col){
        
        if (row == 0) {
            omitScan[0] = true;
            omitScan[1] = true;
            omitScan[2] = true;
        }
        

        if (row == m - 1) {
            omitScan[5] = true;
            omitScan[6] = true;
            omitScan[7] = true;
        }
        
        if (col == 0) {
            omitScan[0] = true;
            omitScan[3] = true;
            omitScan[5] = true;
        }

        if (col == 1) {
            if (row > 0) omitScan[0] = false;
            omitScan[3] = false;
            if (row < m - 1) omitScan[5] = false;
        }

        if (col == n - 1) {
            omitScan[2] = true;
            omitScan[4] = true;
            omitScan[7] = true;
        }
    }
}
